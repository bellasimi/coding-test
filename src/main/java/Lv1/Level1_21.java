package Lv1;

import java.util.Scanner;
/*https://programmers.co.kr/learn/courses/30/lessons/12921/solution_groups?language=java*/
public class Level1_21 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 n을 입력!");
        int n = sc.nextInt();
        int answer=1;//2는 무조건 소수라 제외

       for(int i=3;i<=n;i++){
            int cnt=0;
           System.out.println("i: "+i);
            for(int j=2;j<=Math.sqrt(i);j++){ //j를 제곱근까지로 정한 이유는 약수는 제곱근을 기준으로 +-되기 때문.
                /* 지금 1과 i를 제외헀는데 나머지가 0인애가 있으면 안됨!(소수는 1과 자신만을 약수로 가짐)*/
                System.out.println("j: "+j);
                if(i%j==0){ cnt++; break;}
            }

            answer += cnt==0? 1:0;
        }
        System.out.println(answer);
    }
}
