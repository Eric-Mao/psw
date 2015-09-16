package com.eric.psw.model;

import com.eric.psw.inteface.Page;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by eric on 15-9-6.
 *  All page's parent page, It provide the basic function like listAll, add, get, modify, del
 *
 */
public abstract class BasePage implements Page {
    BasePage page = null;
    public abstract BaseResultModel listAll( HttpServletRequest request );
    public abstract BaseResultModel get( String id );
    public abstract BaseResultModel add( HttpServletRequest request, BaseModel baseModel );
    public abstract BaseResultModel modify( HttpServletRequest request, BaseModel baseModel );
    public abstract BaseResultModel del( String id );
}
