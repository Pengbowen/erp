package com.pbw.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 程序主入口
 */
@SpringBootApplication
@ServletComponentScan
public class ErpApplication {


	public static void main(String[] args) {
		SpringApplication.run(ErpApplication.class, args);
	}

	/**
	 * 修改DispatcherServlet默认配置
	 *
	 * @param dispatcherServlet
	 * @return
	 * @author SHANHY
	 * @create  2016年1月6日
	 */
	@Bean
	public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
		ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
		registration.getUrlMappings().clear();
		registration.addUrlMappings("*.do");
		registration.addUrlMappings("*.json");
		return registration;
	}
}
