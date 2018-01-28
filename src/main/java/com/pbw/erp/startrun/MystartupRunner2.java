package com.pbw.erp.startrun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 启动时加载此类
 *
 *
 */
@Component
@Order(value = 2)
public class MystartupRunner2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>项目启动时会优先执行此类.此类的@Order =2<<<<<<<<<<<<<<<<");
    }
}
