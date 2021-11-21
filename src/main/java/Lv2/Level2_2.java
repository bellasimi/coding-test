package Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level2_2 {

    public static void main(String[]args){
        int[][] arr1 = {{2,3,2},{4,2,4},{3,1,4}};
        int[][] arr2 = {{5,4,3},{2,4,1},{3,1,1}};
        Level2_2 l = new Level2_2();
        System.out.println(l.solution(arr1,arr2));
    }
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int len1 = Math.max(arr1.length, arr2.length);
        int len2 = arr1[0].length;
        int[][] answer = new int[len1][len2];
        List<Integer> result = new ArrayList<Integer>();

       int[] arr = new int[len2];
       for(int[] a1:arr1){
            for(int[] a2:arr2){
                    int a = 0;
                    for(int i=0;i<len2;i++){
                        a += a1[i]*a2[i];
                        System.out.println(Arrays.toString(a1));
                        System.out.println(Arrays.toString(a2));
                        System.out.println(a1[i]+"x"+a2[i]+"="+a1[i]*a2[i]);
                    }
                    result.add(a);
            }

        }

       for(int i=0;i<len1;i++){
           for(int j=0;j<len2;j++){

           }
       }

        System.out.println(result);
        System.out.println(Arrays.toString(answer));
        return answer;
    }

}

