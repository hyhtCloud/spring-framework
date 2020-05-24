package entity;

import lombok.Data;



/**
 * @Auther: linqinjie
 * @Date: 2020/5/18 22:45
 * @Description:
 */
@Data
public class Student  {
    private Integer id;
    private String username;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
