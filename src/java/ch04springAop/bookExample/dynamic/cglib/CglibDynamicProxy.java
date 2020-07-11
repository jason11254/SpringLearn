/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04springAop.bookExample.dynamic.cglib;

import ch04springAop.bookExample.aspect.MyAspect;
import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 *
 * @author jason
 */
public class CglibDynamicProxy implements MethodInterceptor {
    /**
     * 創建代理方法 生成CGLIB代理對象
     * target是目標對象 需要增強
     * 返回目標的CGLIB代理對象
     */
    public Object createProxy(Object target){
        //創建一個動態類別對象 即增強類對象
        Enhancer enhancer = new Enhancer();
        //確定需要增強的類別 設為父類別
        enhancer.setSuperclass(target.getClass());
        // 確認代理邏輯對象為當強對象 要求當前對象實現MethodInterceptor方法
        enhancer.setCallback(this);
        //返回創建的代理對象
        return enhancer.create();
    }
    /**
     * intercept 方法會在程式執行目標方法時被調用
     * proxy 是CGLIB根據指定父類別創造的代理對象
     * method是攔截方法
     * os是攔截方法的參數組
     * mp是方法代理對象 用來執行父類別方法
     * 返回代理結果
     */
    @Override
    public Object intercept(Object o, Method method, Object[] os, MethodProxy mp) throws Throwable {
        //創建一個切面
        MyAspect myAspect = new MyAspect();
        //前增強
        myAspect.check();
        myAspect.except();
        //目標方法執行 返回代理結果
        Object obj = mp.invokeSuper(o, os);
        //後增強
        myAspect.log();
        myAspect.monitor();
        return obj;
    }
    
}
