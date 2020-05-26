package entity;

import lombok.Data;

/**
 * @Auther: lqj
 * @Date: 2020/5/18 22:45
 * @Description:
 */
@Data
public class Student  {
    private int id;
    private String username;
    private int age;

    public Student() {
    }

    // 构造方法注入
    public Student(int id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
