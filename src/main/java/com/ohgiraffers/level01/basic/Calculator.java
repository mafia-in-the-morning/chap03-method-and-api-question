package com.ohgiraffers.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }
    public int sum1to10(){
        int sum = 0;
        for(int i = 1;i<11;i++){
            sum=sum+i;
        }
        return sum;





    }
    public int checkMaxNumber(int a,int b){
        int result=0;
        if(a<b){
            result=b;
        }if(a>b){
            result=a;
        }if(a==b){
            result=a;
        }
        return result;


    }



    public int sumTwoNumber(int a, int b){
        return a+b;
    }


    public int minusTwoNumber(int a, int b){
        return (a-b);
    }


}
