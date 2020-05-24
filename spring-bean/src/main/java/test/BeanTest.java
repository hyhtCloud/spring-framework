package test;

import entity.Student;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;




/**
 * @Auther: lqj
 * @Date: 2020/5/18 22:55
 * @Description: bean 的操作
 */
public class BeanTest {
    public static void main(String[] args) {
        // 1.ApplicationContext 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.toString());

        // 2.BeanFactory容器
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource("bean.xml"));

        Student student2 = (Student) factory.getBean("student");
        System.out.println(student2.toString());
    }
}
