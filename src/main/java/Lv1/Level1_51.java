package Lv1;

public class Level1_51 {
    public static void main(String[]args){
        String s = "one4seveneight";

        Level1_51 l = new Level1_51();
        System.out.println(l.solution(s));
    }

    public long solution(String s) {
        long answer = 0;
        String[] nums = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(String n:nums){
            if(s.contains(n)){
                s.replace(n,change(n));
                System.out.println("replace");
            }
        }
        System.out.println(s);
        return answer;
    }

    public String change(String n){
        String change ="";
        switch (n){
            case "zero" :
                change = "0";
                break;
            case "one" :
                change = "1";
                break;
            case "two" :
                change = "2";
                break;
            case "three" :
                change = "3";
                break;
            case "four" :
                change = "4";
                break;
            case "five" :
                change = "5";
                break;
            case "six" :
                change = "6";
                break;
            case "seven" :
                change = "7";
                break;
            case "eight" :
                change = "8";
                break;
            case "nine" :
                change = "9";
                break;

        }
        return change;
    }


}
