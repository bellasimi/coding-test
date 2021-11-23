package Lv2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Level2_5 {
    public static void main(String[]args){
        int[] A ={1,4,2};
        int[] B ={5,4,4};
        Level2_5 l = new Level2_5();
        System.out.println(l.solution(A,B));
    }

    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        List<Integer> list = Arrays.stream(B).boxed().collect(Collectors.toList());
        list.sort(Comparator.reverseOrder());
        for(int i=0;i<A.length;i++){
            answer += A[i]* list.get(i);
        }


        return answer;
    }
}
