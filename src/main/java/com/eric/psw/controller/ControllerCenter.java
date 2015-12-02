package com.eric.psw.controller;

import com.eric.psw.Util.SpringBeanFactoryUtil;
import com.eric.psw.inteface.Page;
import com.eric.psw.model.IModel;
import com.eric.psw.model.BaseResultModel;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by eric on 15-9-17.
 */

@Controller
@RequestMapping( "/controllerCenter" )
public class ControllerCenter{

    @RequestMapping( "doRequest" )
    public BaseResultModel controller( @PathVariable( "option" ) int option, @PathVariable( "page" ) String currentPage, HttpServletRequest _request ){
        /*当前调用页面参数必填*/
        if( StringUtils.isBlank( currentPage ) ){
            return new BaseResultModel( "201", "请明确当前的页面", "请明确当前的页面", "" );
        }
        Page page = ( Page ) SpringBeanFactoryUtil.getBeanByName( currentPage );

        switch( option ){
            case 0:
                page.listAll( _request );
                break;
            case 1:
                page.listAll( _request );
                break;
            case 2:
                page.add( _request, new IModel(){} );
                break;
            case 3:
                page.get( "1" );
                break;
            case 4:
                page.del( "1" );
                break;
            default:
                return new BaseResultModel( "201", "请申明正确的处理规则", "请申明正确的处理规则", "" );
        }


        return new BaseResultModel();
    }

    public BaseResultModel listAll( HttpServletRequest _request ){
        return null;
    }

    public BaseResultModel search( HttpServletRequest _request ){
        return null;
    }

    public BaseResultModel get( long id ){
        return null;
    }

    public BaseResultModel add( HttpServletRequest _request, IModel _model ){
        return null;
    }

    public BaseResultModel modify( HttpServletRequest _request, IModel _model ){
        return null;
    }

    public BaseResultModel del( long id ){
        return null;
    }

}
