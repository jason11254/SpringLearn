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
        //從容器中獲得增強後的目標對象
        TestDao testDaoAdvice = (TestDao) context.getBean("testDao");
        //執行方法
        testDaoAdvice.save();
    }
}
