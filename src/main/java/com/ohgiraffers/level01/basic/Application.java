package com.ohgiraffers.level01.basic;

public class Application {
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
