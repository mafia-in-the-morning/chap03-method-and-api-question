package com.ohgiraffers.level02.normal;

public class Application {
    public static void main(String[] args) {
        RandomMaker rm = new RandomMaker();
        rm.randomNumber(-100, 100);
        System.out.println(rm.randomUpperAlphabet(10));
        System.out.println(rm.rockPaperScissors());
        System.out.println(rm.tossCoin());
    }
}
