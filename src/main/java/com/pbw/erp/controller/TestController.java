package com.pbw.erp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class.getName());

    @RequestMapping("/test")
    public String test(HttpSession session,Model model){
        logger.info("日志输出内容");
        System.out.println("我试试士大夫热部署");
        model.addAttribute("name","彭博文");
        return "index";
    }
}
