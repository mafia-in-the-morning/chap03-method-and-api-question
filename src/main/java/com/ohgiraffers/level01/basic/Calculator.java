package com.ohgiraffers.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        //1부터 10까지의 합을 더해 리턴함
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public void checkMaxNumber(int a, int b){
        //두 수를 입력받아 큰 수를 출력함
        int max = Math.max(a, b);
        System.out.println("두 수 중 큰 수는 " + max +"이다.");
    }

    public int sumTwoNumber(int a, int b){
        //두 수를 입력받아 합을 리턴함
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public int minusTwoNumber(int a, int b){
        //두 수를 입력받아 차를 리턴함
        int sub = 0;
        sub = a - b;
        return sub;
    }
}


