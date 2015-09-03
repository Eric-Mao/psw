package com.eric.psw.test.daoTest;

import com.eric.psw.model.MainPageModel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.eric.psw.service.MainPageService;

/**
 * Created by eric on 15-8-25.
 */
public class MainPageTest {
    private MainPageService pageService;

    @Before
    public void before(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        pageService = (MainPageService) context.getBean("mainPageServiceImpl");
    }

    @Test
    public void addMainPage(){
        MainPageModel page = new MainPageModel();
        page.setUserName("EricMao");
        page.setPassword("111111");
        page.setEmail("ericaojinlin@163.com");
        page.setRemark("ForTest");
        page.setAddress("ZhuHai");
        pageService.add(page);
        System.out.println("Ok");
    }
}
