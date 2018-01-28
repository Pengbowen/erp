package com.pbw.erp.startrun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 启动时加载此类
 * 可以使用@order设置加载顺序
 * 参考文档地址:http://blog.csdn.net/catoop/article/details/50501710
 */

@Component
@Order(value = 1)
public class MystartupRunner1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>项目启动时先执行此类.此类的@Order =1<<<<<<<<<<<<<<<<");

    }
}
