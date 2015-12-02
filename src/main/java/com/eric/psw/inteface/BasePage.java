package com.eric.psw.inteface;

import com.eric.psw.model.IModel;
import com.eric.psw.model.BaseResultModel;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by eric on 15-9-6.
 * All page's parent page, It provide the basic function like listAll, add, get, modify, del
 */
public class BasePage implements Page {
    Page page = null;
    Service service = null;

    public void setPage(Page _page) {
        this.page = _page;
    }

    public void setService(Service _service) {
        this.service = _service;
    }

    public BaseResultModel listAll(HttpServletRequest request) {
        return service.listAll(request);
    }

    public BaseResultModel get(String id) {
        return service.get(id);
    }

    public BaseResultModel add(HttpServletRequest request, IModel _iModel ) {
        return service.add(request, _iModel );
    }

    public BaseResultModel modify(HttpServletRequest request, IModel _iModel ) {
        return service.modify(request, _iModel );
    }

    public BaseResultModel del(String id) {
        return service.del(id);
    }
}
