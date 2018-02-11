package com.mc.ji.common;

import com.vdurmont.emoji.EmojiParser;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 常用工具类
 * @author MC
 * @date 2017-8-8
 */
public class StringUtil {

	/**
	 * 判断查询分页的页面参数是否为null，再设置默认值
	 * @param param
	 * @param defaultInt
	 * @return
	 */
	public static Integer checkPageOrDefault(String param, Integer defaultInt) {
		Integer result = defaultInt;
		if (StringUtils.isNotBlank(param)) {
			result = Integer.valueOf(param);
		}
		return result;
	}

	/**
	 * 通过正则表达式来把obj的驼峰表达式字段转化为数据库DB的字段, 并与表名拼接起来
	 * add by mc 2017-8-30
	 * @param tableName 表别名
	 * @param objField 类字段
	 * @return
	 */
	public static String changeDBfieldPattern(String tableName, String objField) {
		Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher(objField);
		String result = objField;
		while(m.find()) {
			result = result.replace(m.group(),"_" + m.group().toLowerCase());
		}
		if(StringUtils.isNotBlank(tableName) && StringUtils.isNotBlank(result)) {
			result = tableName + "." + result;
		}
		return result;
	}

	/**
	 * 把带有表情的字符串转化为uft-8能保存的string
	 * add by MC 2017-12-12
	 * @param emojiStr
	 * @return
	 */
	public static String encodingEmojiStr(String emojiStr) {
		String resultStr = "";
		if (StringUtils.isNotBlank(emojiStr)) {
			resultStr = EmojiParser.parseToAliases(emojiStr, EmojiParser.FitzpatrickAction.PARSE);
		}
		return resultStr;
	}
}
