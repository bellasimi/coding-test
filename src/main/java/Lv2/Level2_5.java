package Lv2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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

        /* 반복문 인덱스 거꾸로 효율성 최대 1.5ms */

        Arrays.sort(B);

        for(int i=0;i<A.length;i++){
           answer+= A[i]*B[A.length-1-i];
        }


        /* Integer[] 효율성 최대 6ms

        Integer[] arrB = new Integer[B.length];
        for(int i=0;i<B.length;i++){
            arrB[i] = B[i];
        }
        Arrays.sort(arrB,Comparator.reverseOrder());
        for(int i=0;i<A.length;i++){
            answer += A[i]* arrB[i];
        }
        */
        /* list 효율성 시간초과 */

        //List<Integer> list = Arrays.stream(B).boxed().collect(Collectors.toList());
        //list.sort(Comparator.reverseOrder());




        return answer;
    }
}
