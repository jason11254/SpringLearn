/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04springAop.bookExample.aspectj.xml;

import ch04springAop.bookExample.dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jason
 */
public class XMLAspectJTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch04springAop\\bookExample\\aspectj\\xml\\applicationContext.xml");
        //�q�e������o�W�j�᪺�ؼй�H
        TestDao testDaoAdvice = (TestDao) context.getBean("testDao");
        //�����k
        testDaoAdvice.save();
    }
}
