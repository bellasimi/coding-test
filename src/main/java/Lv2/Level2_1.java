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
        int answer = 1;
        Arrays.sort(arr);
        int max = Arrays.stream(arr).max().getAsInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=max;i++){
            for(int a: arr){
                if(a%i==0){
                    list.add(i);
                }
            }
        }
        System.out.println(list);

        return answer;
    }
}
