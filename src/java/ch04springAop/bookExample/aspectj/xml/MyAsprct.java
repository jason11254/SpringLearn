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
 * 切面類別
 */
public class MyAsprct {
    //前置通知 使用JoinPoint 接口作為參數獲得目標對象訊息
    public void before(JoinPoint joinPoint){
        System.out.print("前置通知: 模擬對象權限控制");
        System.out.println(", 目標類別對象: "+joinPoint.getTarget()+", 被增強處理的方法: "+joinPoint.getSignature().getName());
    }
    //後置返回通知
    public void afterReturning(JoinPoint joinPoint){
        System.out.print("後置通知: 模擬刪除臨時文件");
        System.out.println(", 被增強處理的方法: "+joinPoint.getSignature().getName());
    }
    /**
     * 環繞通知
     * ProceedingJoinPoint 是 JointPoint的子接口 代表可以執行的目標方法
     * 返回值類型必須是Object
     * 必須一個參數是ProceedingJoinPoint 類型
     * 必須throws Throwable
     */
    public Object around(ProceedingJoinPoint pjp)throws Throwable{
        //開始
        System.out.println("環繞開始: 執行目標方法前, 模擬開啟事務");
        //執行目標方法
        Object obj = pjp.proceed();
        //結束
        System.out.println("環繞結束: 執行目標方法後, 模擬關閉事務");
        return obj;
    }
    //異常通知
    public void except(Throwable e){
        System.out.println("異常通知: 程序執行異常:"+e.getMessage());
    }
    //後置(最終)通知
    public void after(){
        System.out.println("最終通知: 模擬釋放資源");
    }
}
