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
        // �ЫإN�z��H
        JDKDynamicProxy jDKDProxy = new JDKDynamicProxy();
        // �Ыإؼй�H
        TestDao testDao=new TestDaoImpl();
        // �q�N�z��H����o�W�j�᪺�ؼй�H �ӹ�H�O�ӳQ�N�z��H �L�|�i�J�N�z���޿��k invoke ��
        TestDao testDaoAdvice = (TestDao) jDKDProxy.createProxy(testDao);
        testDaoAdvice.save();
        System.out.println("---------------------------");
        testDaoAdvice.modify();
        System.out.println("---------------------------");
        testDaoAdvice.delete();
    }
}
