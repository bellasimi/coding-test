package Lv1;
/*https://programmers.co.kr/learn/courses/30/lessons/42862/solution_groups?language=java*/
import java.util.*;
import java.util.stream.Collectors;

public class Level1_42 {
    public static void main(String[]args){
        int n =3;
        int[] lost = {1,2};
        int[] reserve = {2,3};

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = n-lost.length;
        boolean[] checked = new boolean[n+1];//0~3

        /* 여분인자 확인 */

        for(int l=0; l<lost.length;l++){
            for(int r =0; r<reserve.length;r++){
                if(reserve[r] == lost[l]){
                    checked[reserve[r]] = true;//2,3
                    answer++;
                }
            }
        }


        /* 여분인자만 체육복 대여 */

        for(int l=0; l<lost.length;l++){
            if(!checked[lost[l]]){
                for(int r =0; r<reserve.length;r++){
                    if(!checked[reserve[r]]){
                        if(reserve[r]==lost[l]-1){
                            answer++;
                            checked[reserve[r]]=true;
                            break;
                        }else if(reserve[r]==lost[l]+1){
                            answer++;
                            checked[reserve[r]]=true;
                            break;
                        }else if(reserve[r]>lost[l]+1){
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
