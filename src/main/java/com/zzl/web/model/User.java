package com.zzl.web.model;

/**
 * author: zhangzl
 * 时间：2017/10/16 22:37.
 * 描述：
 */
public class User {
    private Integer id;

    private String username;
    private String psw;

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw == null ? null : psw.trim();
    }
}
