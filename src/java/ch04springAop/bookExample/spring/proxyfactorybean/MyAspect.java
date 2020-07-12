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
 * �������O
 */
public class MyAspect implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        // �W�j��k
        check();
        except();
        // ����ؼФ�k
        Object obj = mi.proceed();
        // �W�j��k
        log();
        monitor();
        return obj;
    }

    public void check() {
        System.out.println("�����v������");
    }

    public void except() {
        System.out.println("�������`�B�z");
    }

    public void monitor() {
        System.out.println("�ʯ�ʴ�");
    }

    public void log() {
        System.out.println("������x����");
    }
    
}
