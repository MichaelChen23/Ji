package com.mc.ji.common;

/**
 * 常量类
 * @author mc
 * @date 2017-8-8
 */
public abstract class Constant {
	
	public static final Integer SUCCESS_CODE = 200;
	
	public static final String SUCCESS_MSG = "成功";

	public static final Integer FAIL_CODE = 500;

	public static final String FAIL_MSG = "失败";

	public static final Integer DEFAULT_CURRENT_PAGE = 1;
	
	public static final Integer DEFAULT_ROWS = 10;

	public static final String STATUS_UNLOCK = "y";

	public static final String STATUS_LOCK = "n";

	/**
	 * 账目方式-收入
	 */
	public static final String ACCOUNT_EARN = "earn";

	/**
	 * 账目方式-支出
	 */
	public static final String ACCOUNT_PAY = "pay";

	/**
	 * 微信api地址
	 */
	public static final String WEI_XIN_API = "https://api.weixin.qq.com/sns/jscode2session";

	/**
	 * 小程序唯一标识
	 */
	public static final String WEI_XIN_APP_ID = "wxe691f5fda926b51b";

	/**
	 * 小程序的 app secret
	 */
	public static final String WEI_XIN_APP_SECRET = "4852586815b755430775bf0ef9f960d9";

	/**
	 * 小程序的认证类型
	 */
	public static final String WEI_XIN_AUTH_TYPE = "authorization_code";

	/**
	 * 升幂排序
	 */
	public static final String ORDER_ASC = "asc";

	/**
	 * 降幂排序
	 */
	public static final String ORDER_DESC = "desc";

}
