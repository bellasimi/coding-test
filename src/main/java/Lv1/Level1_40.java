package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level1_40 {
    public static void main(String[]args){
        int N= 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        int[] user = new int[N+2];//7 0~6
        int[] fail = new int[N]; //0~4
        List<Integer> list = new ArrayList<Integer>();


        int users = 0;
        int unclear = 0;

        for(int i:stages){//각 스테이지 i에 몇명이 있는지 구함
            user[0] =0;
            user[i] +=1;
        }
        for(int j = 1; j<=6; j++){//1~6
            for(int i = j; i<user.length; i++){ //i~6

            }
        }


        i 스테이지 실패율 = 현재 i 유저/i스테이지 이상에 있는 유저수
                만약 현재 i이상 유저 0명이면 = 0, 현재 i의 유저 수 0명 = 0 근데 0으로 나누면 오류 => 조건문

                내가 구할 건 i 스테이지 이상의 유저




        System.out.println(Arrays.toString(user));
    }
}
