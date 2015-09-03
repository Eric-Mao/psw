package com.eric.psw.model;

import java.util.List;

/**
 * Created by eric on 15-8-31.
 */
public class BaseResultModel {
    private String code = "200";
    private String message = "ok";
    private String value = null;
    private String redirect = "";

    public BaseResultModel(String value) {
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }
}
