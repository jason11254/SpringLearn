/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02springIoC.bookExample.service;

import ch02springIoC.bookExample.dao.TestDIDao;


/**
 *
 * @author jason
 */
public class TestDIServiceImpl2 implements TestDIService{
    private TestDIDao testDIDao;
    // �K�[testDIDao��setter��k, �Ψӹ�{�̿�`�J.
    public void setTestDIDao(TestDIDao testDIDao){
        this.testDIDao=testDIDao;
    }

    @Override
    public void sayHello() {
        // �ե�testDiDao��sayHello��k
        testDIDao.sayHello();
        System.out.println("TestDiService setter��k�`�J say: Hello!");
    }
    
}
