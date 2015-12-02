package com.eric.psw.inteface;

import com.eric.psw.model.IModel;
import com.eric.psw.model.BaseResultModel;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by eric on 15-9-17.
 * 通用的Services，所有的Service都实现此接口
 */
public interface Service {

    BaseResultModel listAll( HttpServletRequest request );
    BaseResultModel get( String id );
    BaseResultModel add( HttpServletRequest request, IModel _iModel );
    BaseResultModel modify( HttpServletRequest request, IModel _iModel );
    BaseResultModel del( String id );

}
