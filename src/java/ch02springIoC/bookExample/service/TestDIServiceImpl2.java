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
    // 添加testDIDao的setter方法, 用來實現依賴注入.
    public void setTestDIDao(TestDIDao testDIDao){
        this.testDIDao=testDIDao;
    }

    @Override
    public void sayHello() {
        // 調用testDiDao的sayHello方法
        testDIDao.sayHello();
        System.out.println("TestDiService setter方法注入 say: Hello!");
    }
    
}
