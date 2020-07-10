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
    // 建立方法, 用於實現依賴注入接口對象 testDIDao

    public TestDIServiceImpl(TestDIDao testDiDao) {
        this.testDiDao = testDiDao;
    }
    
    @Override
    public void sayHello() {
        // 調用testDiDao的sayHello方法
        testDiDao.sayHello();
        System.out.println("TestDiService 構造方法注入 say: Hello!");
    }
    
}
