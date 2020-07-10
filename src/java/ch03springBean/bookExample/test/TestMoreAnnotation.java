/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.bookExample.test;

import ch03springBean.bookExample.annotation.controller.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jason
 */
public class TestMoreAnnotation {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("ch03springBean\\bookExample\\applicationContext.xml");
        TestController testCont = (TestController) context.getBean("testController");
        testCont.save();
    }
}
