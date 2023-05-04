package com.ohgiraffers.level02.normal;
public class Application {
    public static void main(String[] args) {


        // randomNumber 호출
        RandomMaker randomMaker = new RandomMaker();
        int result1 = randomMaker.randomNumber(10, 20);
        System.out.println( result1);
        // randomUpperAlphabet 호출
        RandomMaker randomMaker2 = new RandomMaker();
        String result2 = randomMaker2.randomUpperAlphabet(5);
        System.out.println(result2);


        // rockPaperScissors 호출
        RandomMaker randomMaker3 = new RandomMaker();
        String result3 = randomMaker3.rockPaperScissor();
        System.out.println(result3);
        // tossCoin 호출
        RandomMaker randomMaker4 = new RandomMaker();
        String result4 = randomMaker4.tossCoin();
        System.out.println(result4);
    }
}
