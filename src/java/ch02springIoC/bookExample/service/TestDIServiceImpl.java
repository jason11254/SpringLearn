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
public class TestDIServiceImpl implements TestDIService{

    private TestDIDao testDiDao;
    // �إߤ�k, �Ω��{�̿�`�J���f��H testDIDao

    public TestDIServiceImpl(TestDIDao testDiDao) {
        this.testDiDao = testDiDao;
    }
    
    @Override
    public void sayHello() {
        // �ե�testDiDao��sayHello��k
        testDiDao.sayHello();
        System.out.println("TestDiService �c�y��k�`�J say: Hello!");
    }
    
}
