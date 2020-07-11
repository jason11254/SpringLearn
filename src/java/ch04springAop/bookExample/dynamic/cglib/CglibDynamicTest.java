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
        //創建代理對象
        CglibDynamicProxy cdp = new CglibDynamicProxy();
        //創建目標對象
        TestDao testDao = new TestDao();
        //獲得增強後的目標對象
        TestDao testDaoAdvice = (TestDao) cdp.createProxy(testDao);
        //執行方法
        testDaoAdvice.save();
        System.out.println("-------------------");
        testDaoAdvice.modify();
        System.out.println("-------------------");
        testDaoAdvice.delete();
    }
}
