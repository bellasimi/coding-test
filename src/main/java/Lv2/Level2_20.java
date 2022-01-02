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
        /*LinkedList 사용
        Queue<Integer> que = new LinkedList<>();

        for(int pri : priorities){
            que.add(pri);
        }

        Arrays.sort(priorities); //우선순위를 비교하기 위해 오름 차순 정렬
        int length = priorities.length-1; //오름차순 한 마지막 요소가 가장 큰 수

        while(!que.isEmpty()){
            int current = que.poll();
            System.out.println(current);
            //우선순위가 가장 높은 수 == 현재 큐에 담긴 (프린트 순서)가 같으면
            if(current == priorities[length - answer]){
                answer++;
                location--;
                if(location<0){
                    break;
                }
            }else{
                //처음에 que.poll을 했던 수를 add 함으로써 맨 뒤로 밀림
                que.add(current);
                location--; // 1
                if(location<0){
                    location = que.size()-1;
                }
            }
        }
        return answer;*/
       /*우선순위 queue 사용*/

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //내림차순의 우선순위 큐 객체 생성
        for(int i=0;i<priorities.length;i++){
            pq.add(priorities[i]);
        }
        long s = System.currentTimeMillis();
        for(int p: pq){
            System.out.println(p);
        }
        long m = System.currentTimeMillis();
        Iterator<Integer> it = pq.iterator();
        while(it.hasNext()){
            int pp = it.next();
            System.out.println(pp);
        }
        long e = System.currentTimeMillis();
        System.out.println(s);
        System.out.println(m);
        System.out.println(e);
        System.out.println("for시간"+(m-s));
        System.out.println("it시간"+(e-m));
        System.out.println(pq);//{3,2,2,1} i: 2,3,0,1
        while(!pq.isEmpty()){//우선순위 큐가 빌때까지 반복
            for(int i =0;i< priorities.length;i++){
                System.out.println("i: "+i+" value: "+priorities[i]+" stack: "+pq);
                if(priorities[i]==pq.peek()){//현재 중요도와 pq의 최대값이 같을때
                    if(i==location){//제일 중요도 높은 애가, 내가 고른 위치의 아이일 떄
                        answer++; //0부터 시작했기 떄문에 1더해줌
                        return answer;//바로 return
                    }
                    pq.poll();//제일 중요도 높은 애가, 해당 인덱스아니면 맨 위값을 가져온다.
                    answer++;//순서가 +1씩
                }
            }

        }

        return answer;

    }
}
