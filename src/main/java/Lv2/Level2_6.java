package Lv2;

import java.util.Arrays;

public class Level2_6 {
    public static void main(String[]args){
        //String s = "1 2 3 4";
        String s = "-1 -2 -3 -4";
        Level2_6 l = new Level2_6();
        System.out.println(l.solution(s));
    }
    public String solution(String s) {
        String answer = "";

        return answer;



/*      int[]변환 후 Arrays.stream().max -> 너무 시간 오래걸려 13ms

        String[] ss = s.split(" ");
        int[] nums = new int[ss.length];
        for(int i=0;i<ss.length;i++){
            nums[i] = Integer.parseInt(ss[i]);
        }
        answer += Arrays.stream(nums).min().getAsInt();
        answer += " "+Arrays.stream(nums).max().getAsInt();
*/

    }


}
