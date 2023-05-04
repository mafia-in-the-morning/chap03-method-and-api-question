package com.ohgiraffers.level01.basic;

public class Calculator {

    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

        public int sum1to10() {
            // sum1to10 메소드
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    public void checkMaxNumber(int a, int b) {
        if (a > b) {
            System.out.println(a + "이(가) 더 큽니다.");
        } else if (a < b) {
            System.out.println(b + "이(가) 더 큽니다.");
        } else {
            System.out.println("두 수는 같습니다.");
        }
    }
    public int sumTwoNumber(int a, int b){
        int sum= a+b;
        return sum;
    }
    public int minusTwoNumber(int a, int b){
        int minus= a-b;
        return minus;
    }
    }

