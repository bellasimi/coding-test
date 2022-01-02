package Lv2;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Level2_21 {
    public static void main(String[] args){
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;
        Level2_21 l = new Level2_21();
        System.out.println("ㄷㅂ: "+l.solution(scoville, K));
    }
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int answer = 0;
        for(int s: scoville){
            pq.add(s);
        }
        while(pq.peek()<K){

            for(int i = 1; i< scoville.length;i++){
                int sc1 = scoville[i-1];
                int sc2 = scoville[i];

                if(sc1<K){
                    pq.poll();
                    int make = sc1 + (sc2*2);
                    pq.add(make);
                }
            }
            answer++;
        }



/*        Iterator<Integer> it = pq.iterator();
        while(it.hasNext()){

            System.out.println("?: "+it.next());
        }*/
        return answer;
    }
}
