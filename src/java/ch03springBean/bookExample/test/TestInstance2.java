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
public class TestInstance2 {
    public static void main(String[] args) {
        // ��l��Spring �e��ApplicationContext, �[��xml
        ApplicationContext context = new ClassPathXmlApplicationContext("ch03springBean\\bookExample\\applicationContext.xml");
        // Bean scope�q�{�]�w�� singleton �u�|�ͦ��@�ӹ���, �C����id ��name�I�sBean���|�o��P�@�Ӧ@�ɹ���C
        //�غc�l�����Bean, ��^�����P�@��Bean����
        BeanClass b1 = (BeanClass) context.getBean("singletonInstance");
        System.out.println(b1);
        BeanClass b2 = (BeanClass) context.getBean("singletonInstance");
        System.out.println(b2);
        // Bean scope�]�w�� prototype �C�����|�ͦ��@�ӹ���, ��id ��name�I�sBean���|�o�줣�P����C
        BeanClass b3 = (BeanClass) context.getBean("prototypeInstance");
        System.out.println(b3);
        BeanClass b4 = (BeanClass) context.getBean("prototypeInstance");
        System.out.println(b4);       
    }  
}
