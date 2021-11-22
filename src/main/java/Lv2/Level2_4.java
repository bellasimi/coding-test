package Lv2;

import java.util.HashMap;
import java.util.Map;

public class Level2_4 {
    public static void main(String[]args){
        int n = 3;
        Level2_4 l = new Level2_4();
        System.out.println(l.solution(n));
    }
    /* (A+B)%C = ((A%C)+(A%C))%C*/
    public int solution(int n) {
        int answer = 0;

        return answer;
        /* 배열 사용 43점 3ms 오답
        int[] value = new int[n+1];
        value[0] = 0;
        value[1] = 1;
        value[2] = 1;
        for(int i=3;i<=n;i++){
            if(n<1234567){
                value[i] = value[i-1]+value[i-2];
                if(i==n){
                    answer = value[n];
                }
            }
            else{
                value[i] = ((value[i-1]%1234567)+(value[i-2]%1234567))%1234567;
                if(i==n){
                    answer = value[n];
                }
            }

        }

        return answer;
        */
        /* map 사용 43점 23ms 오답
         Map<Integer,Long> map = new HashMap<Integer, Long>();
        map.put(0, Long.valueOf(0));
        map.put(1,Long.valueOf(1));
        for(int i=2;i<=n;i++){
            long value = map.get(i-1) +map.get(i-2);
            map.put(i,value);
        }
        long answer = map.get(n)%1234567;
        return answer;*/
    }
}
