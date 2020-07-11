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
    //�n���ؼ����O���f��H �u���H
    private TestDao testDao;
    //�ЫإN�z��k �إߥN�z��H�M�u���H���N�z���Y ��^�N�z��H
    public Object createProxy(TestDao testDao){
        this.testDao = testDao;
        // ���O�[����
        ClassLoader cld = JDKDynamicProxy.class.getClassLoader();
        // �Q�N�z����H��{���Ҧ����f
        Class[] clazz = testDao.getClass().getInterfaces();
        //�ϥΥN�z���O�W�j ��^�N�z���H
        return Proxy.newProxyInstance(cld, clazz, this);
    }
    /**
        *  �N�z���޿��k �Ҧ��ʺA�N�z���O����k�եγ����Ӥ�k�B�z
        *  proxy �O�Q�N�z��H
        *  method �O�N�n�Q���檺��k
        *  args �O����ɻݭn���Ѽ�
        *  return ��^�N�z���G
     * @throws java.lang.Throwable
        */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //�Ыؤ���
        MyAspect myAspect = new MyAspect();
        //�e�W�j
        myAspect.check();
        myAspect.except();
        // �ؼ����O�W�եΤ�k�öǤJ�Ѽ� �۷��ե�testDao������k
        Object obj = method.invoke(testDao, args);
        //��W�j
        myAspect.log();
        myAspect.monitor();
        return obj;
    }
    
    
}
