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
     * �ЫإN�z��k �ͦ�CGLIB�N�z��H
     * target�O�ؼй�H �ݭn�W�j
     * ��^�ؼЪ�CGLIB�N�z��H
     */
    public Object createProxy(Object target){
        //�Ыؤ@�ӰʺA���O��H �Y�W�j����H
        Enhancer enhancer = new Enhancer();
        //�T�w�ݭn�W�j�����O �]�������O
        enhancer.setSuperclass(target.getClass());
        // �T�{�N�z�޿��H����j��H �n�D��e��H��{MethodInterceptor��k
        enhancer.setCallback(this);
        //��^�Ыت��N�z��H
        return enhancer.create();
    }
    /**
     * intercept ��k�|�b�{������ؼФ�k�ɳQ�ե�
     * proxy �OCGLIB�ھګ��w�����O�гy���N�z��H
     * method�O�d�I��k
     * os�O�d�I��k���ѼƲ�
     * mp�O��k�N�z��H �ΨӰ�������O��k
     * ��^�N�z���G
     */
    @Override
    public Object intercept(Object o, Method method, Object[] os, MethodProxy mp) throws Throwable {
        //�Ыؤ@�Ӥ���
        MyAspect myAspect = new MyAspect();
        //�e�W�j
        myAspect.check();
        myAspect.except();
        //�ؼФ�k���� ��^�N�z���G
        Object obj = mp.invokeSuper(o, os);
        //��W�j
        myAspect.log();
        myAspect.monitor();
        return obj;
    }
    
}
