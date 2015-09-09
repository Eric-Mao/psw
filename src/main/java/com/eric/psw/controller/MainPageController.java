package com.eric.psw.controller;

import com.eric.psw.model.BaseResultModel;
import com.eric.psw.model.MainPageModel;
import com.eric.psw.service.MainPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by eric on 15-8-26.
 */
@Controller
@RequestMapping("/mainPage")
public class MainPageController {

    @Autowired
    private MainPageService pageService;

    @RequestMapping(value="index")
    @ResponseBody
    public BaseResultModel listAll() {
        MainPageModel page = new MainPageModel();
        page.setUserName("EricMao");
        page.setPassword("111111");
        page.setEmail("ericaojinlin@163.com");
        page.setRemark("ForTest");
        page.setAddress("ZhuHai");
        pageService.add(page);
        return new BaseResultModel( "ok" );
    }

    @RequestMapping("get")
    @ResponseBody

    public BaseResultModel get(HttpServletRequest request, @PathVariable("id") long id ) {
        System.out.println( id );
        request.getParameter( "" );
        return new BaseResultModel("ok");
    }
    @RequestMapping("add")
    @ResponseBody
    public BaseResultModel add(HttpServletRequest request, MainPageModel model){
        System.out.println(model);
        pageService.add(model);
        return new BaseResultModel( "ok" );
    }
    @RequestMapping("modify")
    @ResponseBody
    public BaseResultModel modify(HttpServletRequest request, MainPageModel model){

        return new BaseResultModel( "ok" );
    }
    @RequestMapping("del")
    @ResponseBody
    public BaseResultModel delete( HttpServletRequest request, @PathVariable("id") long id  ){
        return new BaseResultModel( "ok" );
    }

}
