/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04springAop.bookExample.dynamic.cglib;

/**
 *
 * @author jason
 */
public class CglibDynamicTest {
    public static void main(String[] args) {
        //�ЫإN�z��H
        CglibDynamicProxy cdp = new CglibDynamicProxy();
        //�Ыإؼй�H
        TestDao testDao = new TestDao();
        //��o�W�j�᪺�ؼй�H
        TestDao testDaoAdvice = (TestDao) cdp.createProxy(testDao);
        //�����k
        testDaoAdvice.save();
        System.out.println("-------------------");
        testDaoAdvice.modify();
        System.out.println("-------------------");
        testDaoAdvice.delete();
    }
}
