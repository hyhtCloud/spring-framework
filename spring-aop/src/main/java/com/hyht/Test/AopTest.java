package com.hyht.Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hyht.service.StudentService;

/**
 * @Auther: lqj
 * @Date: 2020/5/25 16:44
 * @Description:
 */
public class AopTest {

    private ApplicationContext applicationContext;

    @Test
    public void Test() {
        applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        studentService.addStudent("zhangsan");
    }

}
