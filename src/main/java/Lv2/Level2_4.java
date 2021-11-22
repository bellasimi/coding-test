package Lv2;

import java.util.HashMap;
import java.util.Map;

public class Level2_4 {
    public static void main(String[]args){
        int n = 3;
        Level2_4 l = new Level2_4();
        System.out.println(l.solution(n));
    }
    public int solution(int n) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(0,0);
        map.put(1,1);
        for(int i=2;i<=n;i++){
            int value = map.get(i-1) +map.get(i-2);

            map.put(i,value);
        }
        System.out.println(map);
        int answer = map.get(n)%1234567;
        return answer;
    }
}
