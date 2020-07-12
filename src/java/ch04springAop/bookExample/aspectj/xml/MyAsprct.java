/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04springAop.bookExample.aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 * �������O
 */
public class MyAsprct {
    //�e�m�q�� �ϥ�JoinPoint ���f�@���Ѽ���o�ؼй�H�T��
    public void before(JoinPoint joinPoint){
        System.out.print("�e�m�q��: ������H�v������");
        System.out.println(", �ؼ����O��H: "+joinPoint.getTarget()+", �Q�W�j�B�z����k: "+joinPoint.getSignature().getName());
    }
    //��m��^�q��
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
     */
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
    public void except(Throwable e){
        System.out.println("���`�q��: �{�ǰ��沧�`:"+e.getMessage());
    }
    //��m(�̲�)�q��
    public void after(){
        System.out.println("�̲׳q��: ��������귽");
    }
}
