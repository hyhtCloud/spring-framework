package com.hyht.service;

import org.springframework.beans.factory.InitializingBean;

/**
 * @Auther: linqinjie
 * @Date: 2020/5/19 11:39
 * @Description: bean 初始化
 */
public class InitService implements InitializingBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet.....");
    }
}
