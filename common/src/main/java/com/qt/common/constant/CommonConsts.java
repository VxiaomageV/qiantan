package com.qt.common.constant;

/**
 * @author mal
 * @description 系统常量类
 * @data 2020/11/20
 **/
public interface CommonConsts {

    /**
     * 默认页码为1
     */
    Integer DEFAULT_PAGE_INDEX = 1;

    /**
     * 默认页大小为10
     */
    Integer DEFAULT_PAGE_SIZE = 10;

    /**
     * 登录用户
     */
    String LOGIN_SYS_USER = "loginSysUser";

    /**
     * 登陆token
     */
    String JWT_DEFAULT_TOKEN_NAME = "token";

    /**
     * JWT用户名
     */
    String JWT_USERNAME = "username";

    /**
     * JWT刷新新token响应状态码
     */
    int JWT_REFRESH_TOKEN_CODE = 460;

    /**
     * JWT刷新新token响应状态码，
     * Redis中不存在，但jwt未过期，不生成新的token，返回361状态码
     */
    int JWT_INVALID_TOKEN_CODE = 461;

    /**
     * JWT Token默认密钥
     */
    String JWT_DEFAULT_SECRET = "666666";

    /**
     * JWT 默认过期时间，3600L，单位秒
     */
    Long JWT_DEFAULT_EXPIRE_SECOND = 36000L;

    /**
     * 初始密码
     */
    String INIT_PWD = "123456";

    /**
     * 默认头像
     */
    String DEFAULT_HEAD_URL = "";

    /**
     * 管理员角色名称
     */
    String ADMIN_ROLE_NAME = "管理员";

    String ADMIN_LOGIN = "adminLogin";

    /**
     * 验证码token
     */
    String VERIFY_TOKEN = "verifyToken";

    /**
     * 图片
     */
    String IMAGE = "image";

    /**
     * JPEG
     */
    String JPEG = "JPEG";

    /**
     * base64前缀
     */
    String BASE64_PREFIX = "data:image/png;base64,";

}
