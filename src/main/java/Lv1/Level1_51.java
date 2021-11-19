package Lv1;

public class Level1_51 {
    public static void main(String[]args){
        String s = "one4seveneight";

        Level1_51 l = new Level1_51();
        System.out.println(l.solution(s));
    }

    public long solution(String s) {
        long answer = 0;
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] nums2 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        /* switch문 쓰는 방법 0.35ms*/

        for(String n:nums){
            if(s.contains(n)){
                s = s.replaceAll(n,change(n));
            }
        }
        answer = Integer.parseInt(s);

        return answer;

        /* 두개의 같은 길이 배열로 풀이 0.44ms
        for (int i= 0; i < nums.length ; i++) {
            if(s.contains(nums[i])){
                s = s.replaceAll(nums[i],nums2[i]);
            }
        }
        answer = Integer.parseInt(s);*/

    }


    public String change(String n) {
        String change = "";
        switch (n) {
            case "zero":
                change = "0";
                break;
            case "one":
                change = "1";
                break;
            case "two":
                change = "2";
                break;
            case "three":
                change = "3";
                break;
            case "four":
                change = "4";
                break;
            case "five":
                change = "5";
                break;
            case "six":
                change = "6";
                break;
            case "seven":
                change = "7";
                break;
            case "eight":
                change = "8";
                break;
            case "nine":
                change = "9";
                break;

        }
        return change;
    }
}
