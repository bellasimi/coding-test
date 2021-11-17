package Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Level1_46 {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n: nums){
            for(int n2: nums){
                for(int n3:nums){
                   if(n!=n2&&n!=n3&&n2!=n3){
                       map.put(n+n2+n3,map.getOrDefault(n+n2+n3,0)+1);
                       int result =n+n2+n3;
                       System.out.println(n+"+"+n2+"+"+n3+"="+result);
                   }
                }
            }
        }
        Iterator<Map.Entry<Integer, Integer>> keys = map.entrySet().stream().iterator();
        while(keys.hasNext()){
            Map.Entry<Integer, Integer> entry = keys.next();

            int n = entry.getKey();
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0&&n!=2){
                    map.put(n,0);
                }
            }
            map.put(n,map.get(n)/6);//3칸 조합이면 경우의 수가 6이므로 마지막에 6으로 나눠줘야 정답
        }

        System.out.println(map);

        int count = map.entrySet().stream().map(Map.Entry::getValue).reduce((a,b)->a+b).get();
        return count;
    }
    public static void main(String[]args){
        Level1_46 l = new Level1_46();
        int[] nums = {1,2,7,6,4};
        System.out.println(l.solution(nums));
    }
}

