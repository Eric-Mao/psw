package com.eric.psw.inteface;

import com.eric.psw.model.IModel;
import com.eric.psw.model.BaseResultModel;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by eric on 15-9-10.
 *  所有的页面都必须实现这个接口
 */
public interface Page {
    BaseResultModel listAll( HttpServletRequest request );
    BaseResultModel get( String id );
    BaseResultModel add( HttpServletRequest request, IModel _iModel );
    BaseResultModel modify( HttpServletRequest request, IModel _iModel );
    BaseResultModel del( String id );
}