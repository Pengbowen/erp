package com.pbw.erp;

import com.pbw.erp.entity.User;
import com.pbw.erp.service.IUserService;
import com.pbw.erp.service.impl.UserServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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
@MapperScan("com.pbw.erp.mapper")
public class ErpApplication implements CommandLineRunner {

	@Autowired
	private IUserService userService;

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
		//registration.getUrlMappings().clear();
//		registration.addUrlMappings("*.do");
//		registration.addUrlMappings("*.json");
		return registration;
	}

	@Override
	public void run(String... strings) throws Exception {
		User user =userService.selectUserByUserId(1);
		System.out.println(user.getName());
	}
}
