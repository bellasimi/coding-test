package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
/*https://programmers.co.kr/learn/courses/30/lessons/12910/solution_groups?language=java*/
public class Level1_28 {
    public static void main(String[] args){
        int[] arr={1,2,4,3,5};
        int divisor=2;

        int[] divisorArr = Arrays.stream(arr).filter(i->i%divisor==0).sorted().toArray();
        if(divisorArr.length>0){
            System.out.println(Arrays.toString(divisorArr));
        }
        else{
            System.out.println(new int[]{-1});
        }

/*  List에 주입해서 다시 int[]로 바꾸는 풀이

        List<Integer> list = new ArrayList<>();

        for(int i:arr){
            if(i%divisor==0){
                list.add(i);
            }
        }

       if(list.size()>0){
           Collections.sort(list);
           System.out.println(list);
       }else{

           System.out.println(Arrays.toString(new int[]{-1}));
       }*/




    }
}
