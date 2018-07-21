package com.weik.controller;

import com.weik.enitiy.WeContext;
import com.weik.enitiy.WeHome;
import com.weik.enitiy.WeMenu;
import com.weik.services.busi.GetHomeContextServiceImpl;
import com.weik.services.busi.GetHomeMenuServiceImpl;
import com.weik.services.busi.GetHomtModelServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@RestController
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    GetHomtModelServiceImpl getHomtModelService;
    @Autowired
    GetHomeMenuServiceImpl getHomeMenuService;
    @Autowired
    GetHomeContextServiceImpl getHomeContextService;
    /*
    获取首页模板
     */
    @RequestMapping(value = "/homeImage",method = { RequestMethod.GET})
    public List<WeHome> getHomeModel(String x, String y){
        logger.info("entry");
        logger.info("x"+x);
        logger.info("y"+y);
        List<WeHome> homeModel = getHomtModelService.getHomeModel();

        return homeModel;
    }


    /*
    获取首页文章列表
     */
    @RequestMapping(value = "/homeContext")
    public List<WeContext> getHomeContext(){
        logger.info("entry_context");
        List<WeContext> hotContextList = getHomeContextService.getHotContext();
        return hotContextList;
    }

    /*
    获取首页分类列表
     */
    @RequestMapping(value = "/homeClass",method = { RequestMethod.GET})
    public List<WeMenu> getHomeClass(){
        logger.info("entry_class");
        List<WeMenu> allMenu = getHomeMenuService.getAllMenu();
        return allMenu;
    }

}
