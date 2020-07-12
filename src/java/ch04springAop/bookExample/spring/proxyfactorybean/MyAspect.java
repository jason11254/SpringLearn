/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04springAop.bookExample.spring.proxyfactorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 *
 * 切面類別
 */
public class MyAspect implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        // 增強方法
        check();
        except();
        // 執行目標方法
        Object obj = mi.proceed();
        // 增強方法
        log();
        monitor();
        return obj;
    }

    public void check() {
        System.out.println("模擬權限控制");
    }

    public void except() {
        System.out.println("模擬異常處理");
    }

    public void monitor() {
        System.out.println("性能監測");
    }

    public void log() {
        System.out.println("模擬日誌紀錄");
    }
    
}
