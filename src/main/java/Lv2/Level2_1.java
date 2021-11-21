package Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level2_1 {
    public static void main(String[]args){
        int[] arr = {2,6,8,14};
        Level2_1 l = new Level2_1();
        System.out.println(l.solution(arr));
    }
    public int solution(int[] arr) {

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int answer = max*min;

        while(min>0){
            int temp = min;
            min = max%min;
            max = temp;
        }

        answer = answer/max;

        for(int a:arr){
            if(answer%a!=0){
                max = answer;
                min = a;
                answer = max*min;
                while(min>0){
                    int temp = min;
                    min = max%min;
                    max = temp;
                }
                answer = answer/max;
            }
        }

        return answer;
    }
}
