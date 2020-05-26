package com.hyht.service;

import org.springframework.beans.factory.DisposableBean;


/**
 * @Auther: linqinjie
 * @Date: 2020/5/19 11:39
 * @Description: bean 销毁
 */
public class DestoryService implements DisposableBean {

    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}
