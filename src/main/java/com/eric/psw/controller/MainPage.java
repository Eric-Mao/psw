package com.eric.psw.controller;

import com.eric.psw.model.IModel;
import com.eric.psw.inteface.BasePage;
import com.eric.psw.model.BaseResultModel;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by eric on 15-9-10.
 */
@Controller("MainPage")
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
    public BaseResultModel add(HttpServletRequest request, IModel _iModel ) {
        return null;
    }

    @Override
    public BaseResultModel modify(HttpServletRequest request, IModel _iModel ) {
        return null;
    }

    @Override
    public BaseResultModel del(String id) {
        return null;
    }
}