package Lv2;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Level2_21 {
    public static void main(String[] args){
        int[] scoville = {1,2,3,9,10,12};
        long K = 7;
        Level2_21 l = new Level2_21();
        System.out.println("ㄷㅂ: "+l.solution(scoville, K));
    }
    public int solution(int[] scoville, long K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int answer = 0;
        for(int s: scoville){
            pq.add(s);
        }
        while(answer != pq.size()){
            for(int i = 1; i < scoville.length;i++){
                //System.out.println(pq);
                //System.out.println("peek: "+pq.peek());
                int sc1 = scoville[i-1];
                int sc2 = scoville[i];
                //System.out.println("sc1: "+sc1+" sc2: "+sc2);
                int make = sc1 + (sc2*2);
                //System.out.println("make: "+make);
                if(pq.peek()<K){
                    pq.poll();
                    pq.poll();
                    pq.add(make);

                    answer++;
                }else{
                    return answer;
                }

            }

        }
        answer = pq.peek()<K? -1: answer;




/*        Iterator<Integer> it = pq.iterator();
        while(it.hasNext()){

            System.out.println("?: "+it.next());
        }*/
        return answer;
    }
}
