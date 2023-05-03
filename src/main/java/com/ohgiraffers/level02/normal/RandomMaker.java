package com.ohgiraffers.level02.normal;
import java.util.Random;
public class RandomMaker {
    Random random = new Random();
    public int randomNumber(int min, int max){
        return random.nextInt(max - min + 1) + min;

    }
    public String randomUpperAlphabet(int length){
        StringBuilder sb= new StringBuilder(length);
        for(int i=0; i<length; i++){
            sb.append((char) (random.nextInt(26)+'A'));
        }
        return sb.toString();
    }
    public String rockPaperScissor(){
        int choice= random.nextInt(3);
        if(choice==0) return "가위";
        else if(choice==1) return "바위";
        else return "보";
    }
    public String tossCoin(){
        int choice2= random.nextInt(2);
        if(choice2==0) return "앞면";
        else return "뒷면";
    }

}
