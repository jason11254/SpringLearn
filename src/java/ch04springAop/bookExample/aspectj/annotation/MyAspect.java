/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04springAop.bookExample.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * �������O
 */
@Aspect
@Component
public class MyAspect {
    //�w�q���J�I
    @Pointcut("execution(* *.*.dynamic.jdk.*.*(..))")
    private void myPointCut(){
        //����<aop:pointcut id="myPointCut" expression="execution(* *.*.dynamic.jdk.*.*(..))"/>
    }
    //�e�m�q��
    @Before("myPointCut()")//����<aop:before method="before" pointcut-ref="myPointCut"/>
    public void before(JoinPoint joinPoint){
        System.out.print("�e�m�q��: ������H�v������");
        System.out.println(", �ؼ����O��H: "+joinPoint.getTarget()+", �Q�W�j�B�z����k: "+joinPoint.getSignature().getName());
    }
    
    //��m��^�q��
    @AfterReturning("myPointCut()")//����<aop:after-returning method="afterReturning" pointcut-ref="myPointCut"/>
    public void afterReturning(JoinPoint joinPoint){
        System.out.print("��m�q��: �����R���{�ɤ��");
        System.out.println(", �Q�W�j�B�z����k: "+joinPoint.getSignature().getName());
    }
    
   /**
     * ��¶�q��
     * ProceedingJoinPoint �O JointPoint���l���f �N��i�H���檺�ؼФ�k
     * ��^�����������OObject
     * �����@�ӰѼƬOProceedingJoinPoint ����
     * ����throws Throwable
     * @param pjp
     * @return 
     * @throws java.lang.Throwable
     */
    @Around("myPointCut()")//����<aop:around method="around" pointcut-ref="myPointCut"/>
    public Object around(ProceedingJoinPoint pjp)throws Throwable{
        //�}�l
        System.out.println("��¶�}�l: ����ؼФ�k�e, �����}�Ҩư�");
        //����ؼФ�k
        Object obj = pjp.proceed();
        //����
        System.out.println("��¶����: ����ؼФ�k��, ���������ư�");
        return obj;
    }
    //���`�q��
    @AfterThrowing(value = "myPointCut()",throwing = "e")//����<aop:after-throwing method="except" pointcut-ref="myPointCut" throwing="e"/>
    public void except(Throwable e){
        System.out.println("���`�q��: �{�ǰ��沧�`:"+e.getMessage());
    }
    //��m(�̲�)�q��
    @After("myPointCut()")//����<aop:after method="after" pointcut-ref="myPointCut"/>
    public void after(){
        System.out.println("�̲׳q��: ��������귽");
    }
    
}
