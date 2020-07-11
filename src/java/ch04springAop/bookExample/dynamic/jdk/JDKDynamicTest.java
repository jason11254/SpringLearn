/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04springAop.bookExample.dynamic.jdk;

/**
 *
 * @author jason
 */
public class JDKDynamicTest {
    public static void main(String[] args) {
        // 創建代理對象
        JDKDynamicProxy jDKDProxy = new JDKDynamicProxy();
        // 創建目標對象
        TestDao testDao=new TestDaoImpl();
        // 從代理對象中獲得增強後的目標對象 該對象是個被代理對象 他會進入代理的邏輯方法 invoke 中
        TestDao testDaoAdvice = (TestDao) jDKDProxy.createProxy(testDao);
        testDaoAdvice.save();
        System.out.println("---------------------------");
        testDaoAdvice.modify();
        System.out.println("---------------------------");
        testDaoAdvice.delete();
    }
}
