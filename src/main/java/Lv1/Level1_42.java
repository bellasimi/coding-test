package Lv1;

import java.util.*;
import java.util.stream.Collectors;

public class Level1_42 {
    public static void main(String[]args){
        int n =3;
        int[] lost = {1,2};
        int[] reserve = {2,3};
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        int answer = n - lost.length;

        Map<Integer,Integer> borrow = new HashMap<Integer,Integer>();

        int index = 0;
        int indexJ = 0;
        for(int i:reserve){
            for(int j:lost){
                if(i==j){
                    answer++;
                    reserveList.remove(index);
                    lostList.remove(indexJ);
                }
                indexJ++;
            }
            index++;
        }

        System.out.println("reserveList: "+ reserveList);
        System.out.println("lostList: "+ lostList);

        for(int i:reserveList){
            for(int j:lostList){
                if(j==i+1||j==i-1){
                    if(reserve.length>lost.length){
                        borrow.put(j,i);
                    }else{
                        borrow.put(i,j);
                    }
                }
                System.out.println("borrow: "+borrow);
            }

        }

        answer = answer + borrow.size();
        System.out.println(answer);
    }
}
