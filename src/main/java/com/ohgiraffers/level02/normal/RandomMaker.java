package com.ohgiraffers.level02.normal;
import java.util.*;

public class RandomMaker {
    public void randomNumber(int min, int max){
        //최솟값부터 최댓값까지 범위의 난수 반환함
        int randomInt = 0;
        Random random = new Random();

        //bound(범위)는 0이상 n미만이므로 max-min으로 숫자의 개수를 구한 후
        //min 값을 더해 min - max의 범위 내에서 랜덤 정수 생성
        randomInt = random.nextInt(max - min + 1) + min;
        System.out.println(randomInt);
    }

    public String randomUpperAlphabet(int length){
        //인자의 길이만큼의 랜덤한 대문자 알파벳으로 이루어진 문자열을 반환함
        String randomString = null;
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charset.length());
            char randomChar = charset.charAt(index);
            sb.append(randomChar);
        }
        randomString = sb.toString();

        randomString = randomString.toUpperCase();
        return randomString;

    }

    public String rockPaperScissors(){
        //가위바위보 중 한 가지를 반환함
        String randomString = null;
        String[] arr1 = {"가위", "바위", "보"};
        Random random = new Random();
        int index = random.nextInt(arr1.length);

        randomString = arr1[index];
        return randomString;
    }

    public String tossCoin(){
        //동전의 앞면, 뒷면 중 한가지를 반환
        String randomString = null;
        Random random = new Random();
        String[] arr1 = {"앞면", "뒷면"};

        int index = random.nextInt(arr1.length);
        randomString = arr1[index];
        return randomString;
    }
}
