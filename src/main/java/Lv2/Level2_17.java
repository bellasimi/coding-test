package Lv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*https://programmers.co.kr/learn/courses/30/lessons/42584*/
public class Level2_17 {

    public static void main(String[] args){
        int[] prices = {1,2,3,2,3};
        Level2_17 l = new Level2_17();
        System.out.println(l.solution(prices));
    }
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i< prices.length;i++){
            q.offer(prices[i]);
            for(int j=i+1;j< prices.length;j++){
               if(q.peek()<=prices[j]){
                   q.offer(prices[j]);
               }
            }
            answer[i] = q.size()-1;
            q.clear();
        }

        System.out.println(Arrays.toString(answer));

       /* for(int i=0;i< prices.length;i++){
            int cnt = 0;
            for(int j=i+1;j< prices.length;j++){
                if(prices[i]<=prices[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        //System.out.println(Arrays.toString(answer));*/
        return answer;
    }
}
