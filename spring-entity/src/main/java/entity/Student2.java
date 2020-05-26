package entity;

import lombok.Data;

import java.util.*;

/**
 * @Auther: lqj
 * @Date: 2020/5/18 22:45
 * @Description:
 */
@Data
public class Student2 {
    private int id;
    private String username;
    private int age;
    private Dog dog;
    private List<String> hobbies=new ArrayList<String>();
    private Set<String> loves=new HashSet<String>();
    private Map<String,String> works=new HashMap<String,String>();
    private Properties addresses=new Properties();

    public Student2() {
    }

    // 构造方法注入
    public Student2(int id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", dog=" + dog.getName() +
                ", hobbies=" + hobbies +
                ", loves=" + loves +
                ", works=" + works +
                ", addresses=" + addresses +
                '}';
    }
}
