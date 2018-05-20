package com.jonbore.entity;

import java.util.Date;

/**
 * 用户
 *
 *
 * @author bo.zhou
 * @date 2018/5/19
 */
public class User extends BaseEntity{
    private static final long serialVersionUID = 5350960610067766261L;

    /**
     * 用户名
     */
    private String userName;
    /**
     * 登录名称
     */
    private String loginName;
    /**
     * 密码
     */
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
