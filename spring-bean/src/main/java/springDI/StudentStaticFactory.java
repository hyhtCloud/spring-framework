package springDI;

import entity.Student;

/**
 * @Auther: lqj
 * @Date: 2020/5/25 11:40
 * @Description: 静态工厂注入
 */
public class StudentStaticFactory {
    public static Student creatStaticFactory() {
        Student student = new Student();
        student.setId(100);
        student.setUsername("小五");
        student.setAge(20);
        return student;
    }

}
