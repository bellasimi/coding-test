package Lv2;

import java.util.ArrayList;
import java.util.List;

public class Level2_2 {

    public static void main(String[]args){
        int[][] arr1 = {{1,4},{3,2},{4,1}};
        int[][] arr2 = {{3,3},{3,3}};
        Level2_2 l = new Level2_2();
        System.out.println(l.solution(arr1,arr2));
    }
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int len1 = arr1[0].length;
        int len2 = arr2[0].length;
        int[][] answer = {{3,3},{3,3}};
        List<List<Integer>> result = new ArrayList<>();
        for(int[] a1:arr1){
            for(int[] a2:arr2){
                List<Integer> list = new ArrayList<>();
                int a = 0;
                for(int i=0;i<len1;i++){
                    System.out.println(a1[i]*a2[i]);
                    a += a1[i]*a2[i];
                }
                list.add(a);

                result.add(list);
            }
        }

        /*
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){


            }
        }*/

        return answer;
    }

}

