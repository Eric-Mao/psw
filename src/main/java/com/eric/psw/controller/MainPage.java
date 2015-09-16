package com.eric.psw.controller;

import com.eric.psw.model.BaseModel;
import com.eric.psw.model.BasePage;
import com.eric.psw.model.BaseResultModel;
import org.codehaus.jackson.map.deser.ValueInstantiators;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by eric on 15-9-10.
 */
public class MainPage extends BasePage {
    @Override
    public BaseResultModel listAll(HttpServletRequest request) {
        return null;
    }

    @Override
    public BaseResultModel get(String id) {
        return null;
    }

    @Override
    public BaseResultModel add(HttpServletRequest request, BaseModel baseModel) {
        return null;
    }

    @Override
    public BaseResultModel modify(HttpServletRequest request, BaseModel baseModel) {
        return null;
    }

    @Override
    public BaseResultModel del(String id) {
        return null;
    }
}
