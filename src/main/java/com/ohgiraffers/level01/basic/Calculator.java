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
        int minus= a+b;
        return minus;
    }

    public static void main(String[] args) {
        // SumCalculator 클래스의 sum1to10() 메소드 호출
        Calculator calculator = new Calculator();
        int sum = calculator.sum1to10();
        System.out.println("1부터 10까지의 합: " + sum);

        // NumberChecker 클래스의 checkMaxNumber() 메소드 호출
        Calculator checker = new Calculator();
        checker.checkMaxNumber(10, 20);

        // NumberCalculator 클래스의 sumTwoNumber() 메소드 호출
        Calculator calculator2 = new Calculator();
        int result1 = calculator2.sumTwoNumber(10, 20);
        System.out.println("10과 20을 더한 결과: " + result1);

        // NumberCalculator 클래스의 subtractTwoNumber() 메소드 호출
        int result2 = calculator2.minusTwoNumber(10, 5);
        System.out.println("10과 5의 차: " + result2);
    }
    }

