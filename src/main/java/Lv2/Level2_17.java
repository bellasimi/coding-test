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
        Stack<Integer> stack = new Stack<>();

        //오르는 주식 index만 stack에 담기
        for(int i=0; i< prices.length;i++){

            //주식 값이 떨어진 경우 i == 3, prices[i] == 2,  prices[stack.peek()==2]==3
            while(!stack.empty() && prices[i]< prices[stack.peek()]){//주식값이 떨어진경우 반복 -> 오를 떄까지  2<3
                answer[stack.peek()] = i-stack.peek();//현재 인덱스에서 이전 인덱스를 뺌  ans[2] = 3-2 = 1 => 해당 인덱스 동안은 가격유지이므로 answer[떨어지는 index]에 넣어줌
                stack.pop();//stack에 들어간 index 빼 // 2제거 [0,1,2] -> [0,1]
            }

            stack.push(i);//해당 반복문의 index 넣어줌 [0,1,3,4]
        }


        while(!stack.isEmpty()){// 값을 구하지 못한 index -> 가격이 끝까지 떨어지지 않은 주식
            answer[stack.peek()] = prices.length - stack.peek() -1; // answer[0,1,3,4]에 전체 초- 해당 index -1의 값을 넣어줌
            stack.pop();// 위 과정을 거치고 나면 stack에서 index값 제거
        }

        System.out.println(stack);
        System.out.println(Arrays.toString(answer));

        return answer;


        /* for문 풀이 100점
       for(int i=0;i< prices.length;i++){
            for(int j=i+1;j< prices.length;j++){
                answer[i]++;
                if(prices[i]>prices[j]){
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;*/
        /* queue 10점 풀이
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
        return answer;
        */
        /* for문  10점 풀이 */
       /* for(int i=0;i< prices.length;i++){
            int cnt = 0;
            for(int j=i+1;j< prices.length;j++){
                if(prices[i]<=prices[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
        //System.out.println(Arrays.toString(answer));*/

    }
}
