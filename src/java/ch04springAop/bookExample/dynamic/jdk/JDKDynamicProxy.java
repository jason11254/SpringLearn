/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04springAop.bookExample.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import ch04springAop.bookExample.aspect.MyAspect;

/**
 *
 * @author jason
 */
public class JDKDynamicProxy implements InvocationHandler{
    //聲明目標類別接口對象 真實對象
    private TestDao testDao;
    //創建代理方法 建立代理對象和真實對象的代理關係 返回代理對象
    public Object createProxy(TestDao testDao){
        this.testDao = testDao;
        // 類別加載器
        ClassLoader cld = JDKDynamicProxy.class.getClassLoader();
        // 被代理的對象實現的所有接口
        Class[] clazz = testDao.getClass().getInterfaces();
        //使用代理類別增強 返回代理後對象
        return Proxy.newProxyInstance(cld, clazz, this);
    }
    /**
        *  代理的邏輯方法 所有動態代理類別的方法調用都給該方法處理
        *  proxy 是被代理對象
        *  method 是將要被執行的方法
        *  args 是執行時需要的參數
        *  return 返回代理結果
     * @throws java.lang.Throwable
        */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //創建切面
        MyAspect myAspect = new MyAspect();
        //前增強
        myAspect.check();
        myAspect.except();
        // 目標類別上調用方法並傳入參數 相當於調用testDao中的方法
        Object obj = method.invoke(testDao, args);
        //後增強
        myAspect.log();
        myAspect.monitor();
        return obj;
    }
    
    
}
