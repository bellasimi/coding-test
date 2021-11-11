package Lv1;

import java.util.Arrays;
import java.util.Random;

public class Level1_30 {
    public static void main(String[]args){

        int[] player = new int[3];
        int[] playerD = new int[3];
        int[] playerO = new int[3];

        int i = 0;
        int answer = 0;



/*     랜덤 함수를 쓰는 문제가 아니었음

        Random rd = new Random();
        //nextInt()계속 다르게 나오게 하려면 필요!
        rd.setSeed(System.currentTimeMillis());

        *//* 0-10 랜덤으로 3번 뽑기*//*
        for(i=0;i<3;i++){
            //player[i]= rd.nextInt(11);
            player[i]= (int)Math.floor(Math.random()*11);
        }
        System.out.println(Arrays.toString(player));

        *//* 영역 랜덤과 옵션 랜덤 3번 뽑기 *//*
        for(i=0;i<3;i++){
            int randomD = rd.nextInt(3)+1;//1~3
            int randomO = rd.nextInt(3);//0~2
            playerD[i]=randomD;

            switch(randomO){
                case 0:  playerO[i]=1; break;
                case 1:  playerO[i]=2; break;
                case 2:  playerO[i]=-1; break;
            }
            //이렇게 하면 해당 숫자를 특정 값이라고 생각하면 == 특정값을 랜덤으로 뽑는 것과 같음
        }
        System.out.println(Arrays.toString(playerD));
        System.out.println(Arrays.toString(playerO));


        for(i=0;i<3;i++){

            answer+=Math.pow(player[i],playerD[i])*playerO[i];
            System.out.println(player[i] + "제곱" + playerD[i] + "x" + playerO[i]);
            System.out.println(answer);

        }*/

    }
}
