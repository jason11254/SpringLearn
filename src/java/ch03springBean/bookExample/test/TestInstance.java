/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.bookExample.test;

import ch03springBean.bookExample.instance.BeanClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jason
 */
public class TestInstance {
    public static void main(String[] args) {
        // ��l��Spring �e��ApplicationContext, �[��xml
        ApplicationContext context = new ClassPathXmlApplicationContext("ch03springBean\\bookExample\\applicationContext.xml");
        // ���իغc�l�����Bean
        BeanClass b1 = (BeanClass) context.getBean("constructorInstance");
        System.out.println(b1);
        System.out.println(b1.message);
    }
}
