package springDI;

import entity.Student;

/**
 * @Auther: lqj
 * @Date: 2020/5/25 11:40
 * @Description: 工厂方法注入
 */
public class StudentFactory {
    public Student creatFactory() {
        Student student = new Student();
        student.setId(99);
        student.setUsername("小四");
        student.setAge(17);
        return student;
    }

}
