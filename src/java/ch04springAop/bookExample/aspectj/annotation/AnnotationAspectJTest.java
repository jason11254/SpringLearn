/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04springAop.bookExample.aspectj.annotation;

import ch04springAop.bookExample.dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jason
 */
public class AnnotationAspectJTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch04springAop\\bookExample\\aspectj\\annotation\\applicationContext.xml");
        TestDao testDaoAdvice = (TestDao) context.getBean("testDao");
        testDaoAdvice.save();
    } 
}
