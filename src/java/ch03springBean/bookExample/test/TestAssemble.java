/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.bookExample.test;

import ch03springBean.bookExample.assemble.ComplexUesr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jason
 */
public class TestAssemble {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch03springBean\\bookExample\\applicationContext.xml");
        // 使用建構子配置
        ComplexUesr u1 = (ComplexUesr) context.getBean("user1");
        System.out.println(u1);
        // 使用settet配置
        ComplexUesr u2 = (ComplexUesr) context.getBean("user2");
        System.out.println(u2);
    }
}
