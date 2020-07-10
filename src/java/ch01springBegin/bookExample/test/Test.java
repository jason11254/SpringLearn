/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch01springBegin.bookExample.test;

import ch01springBegin.bookExample.dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author jason
 */
public class Test {
    public static void main(String[] args) {
        // ��l��ApplicationContext Spring�e��, ���Jxml�ɮ�
        ApplicationContext appCon = new ClassPathXmlApplicationContext("ch01springBegin\\bookExample\\applicationContext.xml");
        // �q�L�e�����otest���
        TestDao tt = (TestDao)appCon.getBean("test");
        tt.sayHello();
    }
}
