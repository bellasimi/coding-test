package Lv1;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Level1_41 {
    public static void main(String[]args){
        int[] nums = {1,2,3,4,5,6};
        //boxed()를 쓰면 int -> Integer로 박싱됨
        int answer = Arrays.stream(nums).boxed().collect(Collectors.collectingAndThen(Collectors.toSet(), p -> Integer.min(p.size(),nums.length/2)));
        Set<Integer> type = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        System.out.println(type);
        System.out.println(answer);
    }
}
