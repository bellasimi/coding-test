package Lv1;

import java.util.Arrays;
/*https://programmers.co.kr/learn/courses/30/lessons/12940/solution_groups?language=java*/
public class Level1_9 {

    public static void main(String[]args){
        int n=2;
        int m=7;

        int [] answer = new int[2];

        int big = Math.max(n,m);
        int small = Math.min(n,m);

        /*유클리드 호제법*/
        while(small>0){
            int temp =small;
            small = big%small;
            big = temp;
        }
        answer[0] =big;
        answer[1] =n*m/big;
        /*논리연산자와 for문
        for(int i=0;i<n+m;i++){
            if(n%i==0&&m%i==0){
                answer[0]= i; //이러면 조건을 만족하는 맨 마지막 i가 들어가서 최대공약수가된다.
                answer[1]= n*m/i;
            }
        }
         */

        System.out.println(Arrays.toString(answer));
    }
}
