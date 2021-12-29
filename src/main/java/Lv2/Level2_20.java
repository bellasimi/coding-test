package Lv2;

import java.util.*;

public class Level2_20 {
    public static void main(String[] args){
        int[] priorities = {2, 1, 3, 2};
        int location = 2;//index
        Level2_20 l = new Level2_20();
        System.out.println(l.solution(priorities,location));
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int max = Arrays.stream(priorities).max().getAsInt();
        int maxIdx = 0;

        Map<Integer,Integer> map = new HashMap<>();//인덱스, 값
        for(int i=0;i<priorities.length;i++){
            if(priorities[i]==max){
            maxIdx = i;
            }
        }
        /*
        for(int i=0;i<priorities.length;i++){
            map.put(i,priorities[i]);
        }*/

        System.out.println(max);

        Stack<Integer> stack = new Stack<>();

        stack.push(max);//인덱스

        for(int i=0;i<priorities.length;i++){
            if(priorities[i]>=max){
                stack.push(priorities[i]);
                map.put(i,stack.size()-1);
            }
        }



        System.out.println(map);
        System.out.println(stack);
        return answer;
    }
}
