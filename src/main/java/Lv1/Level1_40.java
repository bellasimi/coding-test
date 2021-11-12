package Lv1;

import java.util.*;
import java.util.stream.Collectors;

public class Level1_40 {
    public static void main(String[]args){
/*        int N= 4;
        int[] stages = {4,4,4,4,4};*/

        int N= 5;
        int[] stages = {2,1,2,6,2,4,3,3};

        int[] user = new int[N+2];//7  0~6
        double[] fail = new double[N+1];//6  0~5
        Map<Integer,Double> map = new HashMap<Integer, Double>();



        for(int i:stages){//각 스테이지 i에 몇명이 있는지 구함
            user[0] =0;
            user[i] +=1;
        }
        for(int j = 1; j<fail.length; j++){//1~5
            int cnt = 0;
            for(int i = j; i<user.length; i++){ //i~6
                if(user[i]==0){
                    map.put(j,0.0);
                }

                cnt += user[i];
            }
            System.out.println(cnt);
            System.out.println(user[j]);
            double failure = (double) user[j]/cnt;
            map.put(j,failure);
        }

        System.out.println(map);


        map.entrySet().stream().sorted(Map.Entry.comparingByValue()); //이러면 내림차순 정렬 안돼 ...
        /*list 내림차순 정렬
        List<Map.Entry<Integer,Double>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> (int) (o2.getValue()-o1.getValue()));

        System.out.println(list);
        */
/*
        i 스테이지 실패율 = 현재 i 유저/i스테이지 이상에 있는 유저수
                만약 현재 i이상 유저 0명이면 = 0, 현재 i의 유저 수 0명 = 0 근데 0으로 나누면 오류 => 조건문

                내가 구할 건 i 스테이지 이상의 유저

*/

        System.out.println(Arrays.toString(fail));

        System.out.println(Arrays.toString(user));
    }
}
