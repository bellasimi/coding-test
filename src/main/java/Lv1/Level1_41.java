package Lv1;

import java.util.Arrays;

public class Level1_41 {
    public static void main(String[]args){
        int[] nums = {1,2,3,4,5,6};
        int answer = 0;

        Arrays.sort(nums);

        /*List<Integer> type = new ArrayList<Integer>();
        type.add(nums[0]);
        List getLast() 함수가 없네? 마지막 인자 계속 비교해야 되는데 못쓰것네...
        */

        String type = String.valueOf(nums[0]);

        for(int i:nums){
            if(!type.contains(String.valueOf(i))){
                type+=i;
            }
        }

        System.out.println(type);

        int get = nums.length/2;
        int typeTotal = type.length();

        answer = get>typeTotal? typeTotal:get;

        System.out.println(answer);
    }
}
