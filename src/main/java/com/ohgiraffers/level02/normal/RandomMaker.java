package com.ohgiraffers.level02.normal;

import java.util.Random;

public class RandomMaker {

    public int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public String randomUpperAlphabet(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'A');
            sb.append(randomChar);
        }
        return sb.toString();
    }
    public String rockPaperScissors() {
        Random random = new Random();
        int randomIndex = random.nextInt(3);
        String[] choices = {"가위", "바위", "보"};
        return choices[randomIndex];
    }
    public String tossCoin() {
        Random random = new Random();
        int randomIndex = random.nextInt(2);
        String[] sides = {"앞면", "뒷면"};
        return sides[randomIndex];
    }
}
