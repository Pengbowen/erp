package com.pbw.erp.filters;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


/**
 * @author 彭博文的计算机
 *
 * @filterName 测试拦截器
 * @urlPatterns 设置拦截所有请求
 *
 */
@WebFilter(filterName = "test_filter",urlPatterns = "/*")
public class MyTestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行过滤操作");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

        System.out.println("过滤器销毁");
    }
}
