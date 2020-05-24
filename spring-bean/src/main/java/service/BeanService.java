package service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Auther: linqinjie
 * @Date: 2020/5/19 11:48
 * @Description:
 */
public class BeanService implements InitializingBean, DisposableBean {


    public void afterPropertiesSet() throws Exception {
        System.out.println("bean 初始化回调");
    }
    public void destroy() throws Exception {
        System.out.println("bean 销毁回调");
    }

    public void hello(){
        System.out.println("helle method .....");
    }
}
