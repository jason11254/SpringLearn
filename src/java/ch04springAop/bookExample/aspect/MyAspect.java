/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04springAop.bookExample.aspect;

/**
�إߦh�ӳq�� �W�j�B�z��k
 */
public class MyAspect {
    public void check(){
        System.out.println("�����v������");
    }
    public void except(){
        System.out.println("�������`�B�z");
    }
    public void log(){
        System.out.println("������x����");
    }
    public void monitor(){
        System.out.println("�ʯ�ʴ�");
    }
}
