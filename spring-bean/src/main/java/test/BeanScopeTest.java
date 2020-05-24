package test;

import entity.Student;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Auther: lqj
 * @Date: 2020/5/18 22:55
 * @Description: bean 的作用域
 */
public class BeanScopeTest {
    public static void main(String[] args) {
        // 测试单例模式
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-scope.xml");
        Student studentA = (Student) applicationContext.getBean("studentSing");
        Student studentB = (Student) applicationContext.getBean("studentSing");
        System.out.println(studentA == studentB);
        System.out.println("---------Singleton-----");
        Student studentC = (Student) applicationContext.getBean("studentPro");
        Student studentD = (Student) applicationContext.getBean("studentPro");
        System.out.println(studentC == studentD);
    }
}
