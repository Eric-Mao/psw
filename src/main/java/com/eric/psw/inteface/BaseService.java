package com.eric.psw.inteface;

import com.eric.psw.model.IModel;
import com.eric.psw.model.BaseResultModel;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by eric on 15-9-17.
 */
public class BaseService implements Service {

    public BaseResultModel listAll(HttpServletRequest request) {
        return null;
    }

    public BaseResultModel get(String id) {
        return null;
    }

    public BaseResultModel add(HttpServletRequest request, IModel _iModel ) {
        return null;
    }

    public BaseResultModel modify(HttpServletRequest request, IModel _iModel ) {
        return null;
    }

    public BaseResultModel del(String id) {
        return null;
    }
}
