/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.bookExample.test;

import ch03springBean.bookExample.annotation.AnnotationUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jason
 */
public class TestAnnotationUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch03springBean\\bookExample\\applicationContext.xml");
        AnnotationUser au = (AnnotationUser) context.getBean("annotationUser");
        System.out.println(au.getUname());
    }
}
