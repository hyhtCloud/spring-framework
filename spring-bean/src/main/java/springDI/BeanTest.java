package springDI;

import entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Auther: lqj
 * @Date: 2020/5/18 22:55
 * @Description: Spring 依赖注入
 */
public class BeanTest {

    private ApplicationContext applicationContext;

    @Test
    public void test1() {
        // 1.属性注入
        applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }

    @Test
    public void test2() {
        // 2 构造方法注入(类型，索引，组合使用)
        applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");
        Student student2 = (Student) applicationContext.getBean("student2");
        System.out.println(student2);

        Student student3 = (Student) applicationContext.getBean("student3");
        System.out.println(student3);

        Student student4 = (Student) applicationContext.getBean("student4");
        System.out.println(student4);
    }

    @Test
    public void testFactory() {
        // 工厂方法注入
        applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");
        Student student5 = (Student) applicationContext.getBean("student5");
        System.out.println(student5);
    }

    @Test
    public void testStaticFactory() {
        applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");
        Student student6 = (Student) applicationContext.getBean("student6");
        System.out.println(student6);
    }
}
