package com.eric.psw.controller;

import com.eric.psw.dao.MainPageDao;
import com.eric.psw.model.BaseResultModel;
import com.eric.psw.model.MainPageModel;
import com.eric.psw.service.MainPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public BaseResultModel get(){
        return new BaseResultModel( "ok" );
    }
    public BaseResultModel add(){

        return new BaseResultModel( "ok" );
    }

    public BaseResultModel modify(){

        return new BaseResultModel( "ok" );
    }

    public BaseResultModel delete(){
        return new BaseResultModel( "ok" );
    }

}
