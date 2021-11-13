package Lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Level1_41 {
    public static void main(String[]args){
        int[] nums = {1,2,3,4,5,6};
        int answer = 0;

        /*Set을 이용하는 방법*/
        Set<Integer> type = new HashSet<Integer>();

        for(int i:nums){
            type.add(i);
        }


        int get = nums.length/2;
        int typeTotal = type.size();

        answer = get>typeTotal? typeTotal:get;

        System.out.println(answer);
    }
}
