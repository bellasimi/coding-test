package Lv2;

import java.util.*;

public class Level2_20 {
    public static void main(String[] args){
        int[] priorities = {2, 1, 3, 2};
        int location = 1;//index
        Level2_20 l = new Level2_20();
        System.out.println(l.solution(priorities,location));
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
       /*우선순위 queue 사용 */

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //내림차순의 우선순위 큐 객체 생성
        for(int i=0;i<priorities.length;i++){
            pq.add(priorities[i]);
        }
        System.out.println(pq);//{3,2,2,1} i: 2,3,0,1
        while(!pq.isEmpty()){//우선순위 큐가 빌때까지 반복
            //System.out.println("tkd"+pq.peek());
            for(int i =0;i< priorities.length;i++){
                //System.out.println("i: "+i+" value: "+priorities[i]+" stack: "+pq);
                if(priorities[i]==pq.peek()){//현재 중요도와 pq의 최대값이 같을때
                    if(i==location){//제일 중요도 높은 애가, 내가 고른 위치의 아이일 떄
                        answer++; //0부터 시작했기 떄문에 1더해줌
                        return answer;//바로 return
                    }
                    pq.poll();//제일 중요도 높은 애가, 해당 인덱스아니면 버려
                    answer++;//순서가 +1씩
                }
            }

        }

        return answer;

    }
}
