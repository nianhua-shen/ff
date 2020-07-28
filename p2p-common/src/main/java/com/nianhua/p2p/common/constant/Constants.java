package com.nianhua.p2p.common.constant;

import com.nianhua.p2p.model.loan.LoanInfo;

import java.util.HashMap;
import java.util.List;

/**
    常量相关类
 */
public class Constants {

    /**
     * 历史平均年化收益率
     */
    public static final String HISTORY_AVERAGE_RATE = "historyAverageRate";

    /**
     * 获取平台注册总人数
     */
    public static final String ALL_USER_COUNT = "allUserCount";

    /**
     * 平台累计投资金额
     */
    public static final String ALL_BID_MONEY = "allBidMoney";


    /**
     * 产品信息
     */
    public static final List<LoanInfo> PRODUCT_LIST = null;

    /**
     * 产品类型：新手宝0
     */
    public static final Integer PRODUCT_TYPE_X = 0;

    /**
     * 产品类型：优选产品1
     */
    public static final Integer PRODUCT_TYPE_U = 1;

    /**
     * 产品类型：散标产品2
     */
    public static final Integer PRODUCT_TYPE_S = 2;

    /**
     * 图形验证
     */
    public static final String CAPTCHA = "captcha";

    /**
     * 错误消息
     */
    public static final String ERROR_MESSAGE = "errorMessage";

    /**
     * OK
     */
    public static final String OK = "OK";

    /**
     * SUCCESS
     */
    public static final String SUCCESS = "SUCCESS";

    /**
     * FAIL
     */
    public static final String FAIL = "FAIL";

    /**
     * 用户信息
     */
    public static final String SESSION_USER = "user";

    /**
     * 用户投资排行榜
     */
    public static final String INVEST_TOP = "investTop";

    /**
     * 唯一数字
     */
    public static final String ONLY_NUMBER = "onlyNumber";

    /**
     * 账户新用户赠送余额
     */
    public static final Double BALANCE = 888.0;
    /**
     * 账户信息
     */
    public static final String SESSION_FINANCE = "finance";

    /**
     * 用户收益记录信息
     */
    public static final String SESSION_INCOMERECORD = "incomeRecord";
}
