package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BeanService;

/**
 * @Auther: lqj
 * @Date: 2020/5/19 11:46
 * @Description: bean 生命周期
 */
public class beanLifeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-life.xml");
        BeanService beanService = (BeanService) applicationContext.getBean("beanservice");
        System.out.println(beanService);

        String a ="";
        System.out.println("aaa"+a);

    }
}
