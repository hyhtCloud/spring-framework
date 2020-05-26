package springIOC;

import entity.Student2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: lqj
 * @Date: 2020/5/25 13:03
 * @Description: IOC 注入参数
 * 1 基本类型值
 * 2注入bean
 * 3内部bean
 * 4，null 值;
 * 5,集合类型属性;
 */
public class IocTest {

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-ioc.xml");
    @Test
    public void test(){
        //注入bean
        Student2 s = (Student2) applicationContext.getBean("student2");
        System.out.println(s);
    }

    @Test
    public void test2(){
        //内部bean
        Student2 s = (Student2) applicationContext.getBean("student3");
        System.out.println(s);
    }
    @Test
    public void test3() {
        //null
        // toString 方法的dog.getName 去掉 getName
        Student2 s = (Student2) applicationContext.getBean("student4");
        System.out.println(s);
    }
    @Test
    public void test4() {
        //级联属性
        // toString 方法的dog.getName 去掉 getName
        Student2 s = (Student2) applicationContext.getBean("student5");
        System.out.println(s);
    }

}
