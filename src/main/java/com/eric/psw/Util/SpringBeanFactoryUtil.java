package com.eric.psw.Util;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Objects;

/**
 * Created by eric on 15-9-17.
 */
public class SpringBeanFactoryUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;

    public void setApplicationContext(ApplicationContext _applicationContext) throws BeansException {
        applicationContext = _applicationContext;
    }

    public static Object getBeanByName(String _beanName) {
        if ( StringUtils.isBlank(_beanName) ) {
            throw new RuntimeException("Bean的名字不能为空");
        }
        return applicationContext.getBean(_beanName);
    }

}
