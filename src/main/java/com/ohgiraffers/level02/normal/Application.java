package com.ohgiraffers.level02.normal;

public class Application {
    public static void main(String[] args) {
        RandomMaker randomMaker = new RandomMaker();


        int randomNumber = randomMaker.randomNumber(1, 10);
        System.out.println("랜덤 숫자: " + randomNumber);

        String randomAlphabet = randomMaker.randomUpperAlphabet(5);
        System.out.println("랜덤 알파벳: " + randomAlphabet);

        String rps = randomMaker.rockPaperScissors();
        System.out.println("가위바위보: " + rps);

        String coin = randomMaker.tossCoin();
        System.out.println("동전 던지기: " + coin);
    }
}
