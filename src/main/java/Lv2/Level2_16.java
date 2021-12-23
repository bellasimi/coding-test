package Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Level2_16 {
    public static void main(String[] args){
        int[] progresses = {92,30,55};
        int[] speeds = {1,30,5};
        Level2_16 l = new Level2_16();
        System.out.println(l.solution(progresses,speeds));
    }
    public List<Integer> solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> pro = new Stack<>();
        int done = 0;
        int cnt = 0;
        List<Integer> list = new ArrayList<>();

        for(int i=progresses.length-1;i>=0;i--){
            pro.push(i);
        }

        while(cnt!= progresses.length){

            for(int i=0;i< progresses.length;i++){

                progresses[i] += speeds[i];

                if(progresses[i] == 100){

                    stack.push(i);
                    cnt++;
                    if(pro.peek().equals(i)){
                        list.add(stack.size());
                        stack.clear();
                        pro.pop();
                    }
                }//if
            }//for
        }//while

        return list;
    }
}
