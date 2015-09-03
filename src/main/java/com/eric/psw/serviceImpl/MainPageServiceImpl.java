package com.eric.psw.serviceImpl;

import com.eric.psw.dao.MainPageDao;
import com.eric.psw.model.MainPageModel;
import com.eric.psw.service.MainPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;

/**
 * Created by eric on 15-8-25.
 */

@Service("pageService")
public class MainPageServiceImpl implements MainPageService {

    @Autowired
    private MainPageDao mainDao;

    public void add(MainPageModel model) {
        System.out.println("Model" + model);
        System.out.println(model);
        mainDao.add(model);
    }
}
