package Lv1;

import java.util.ArrayList;
import java.util.List;
/*https://programmers.co.kr/learn/courses/30/lessons/12928/solution_groups?language=java*/
public class Level1_17 {
    public static void main(String[]args){
        int n = 13;
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){sum+=i;}
        }
        sum = sum+n;
        /* for(int i=1;i<=n;i++){

            if(n%i==0) {list.add(i);}
        }
       for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        System.out.println(list);
        }*/
        System.out.println(sum);

    }
}
