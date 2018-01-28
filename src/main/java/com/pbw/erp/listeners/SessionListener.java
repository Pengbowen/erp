package com.pbw.erp.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class SessionListener implements HttpSessionListener  {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

        System.out.println("session 被创建啊");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("session 被销毁");
    }
}
