package com.mc.ji.common;

import org.apache.commons.lang3.StringUtils;

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
}
