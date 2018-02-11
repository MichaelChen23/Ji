package com.mc.ji.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 常用日期工具类
 * @author MC
 * @date 2017-11-27
 */
public class DateUtil {

    /**
     * 把date转换为"yyyy-MM-dd"格式的字符串
     * @param date
     * @return
     */
    public static String getDateStr(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
}
