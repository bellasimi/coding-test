package Lv2;

import java.util.*;
import java.util.stream.Collectors;

public class Level2_13 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int len = priorities.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        /* key: 기존인덱스, value: 중요도*/
        for(int i=0;i<len;i++){
            map.put(i,priorities[i]);
        }
        /* 중요도로 내림정렬*/
        List <Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o2.getValue() - o1.getValue()>0){
                    return 1;
                }
                if(o2.getValue() - o1.getValue()<0){
                    return -1;
                }
                return o1.getKey()-o2.getKey();


            }
        });

        System.out.println(list);

        /* 해당 위치의 인덱스값 얻기 */
        //answer = list.indexOf();
        System.out.println("로케이션의 중요도:"+map.get(location));
        return answer;
    }
    public static void main(String[] args){
        Level2_13 l = new Level2_13();
        int[] priorities = {2,1,3,2};
        int location = 2;
        System.out.println(l.solution(priorities,location));
    }


}
