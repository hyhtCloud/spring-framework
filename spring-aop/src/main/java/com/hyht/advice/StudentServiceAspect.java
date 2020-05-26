package com.hyht.advice;





import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;

/**
 * @Auther: lqj
 * @Date: 2020/5/25 16:21
 * @Description:
 */
public class StudentServiceAspect {

    public void doBefore(Joinpoint joinpoint) {

        System.out.println("开始添加学生");
    }
}
