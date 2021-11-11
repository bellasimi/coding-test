package Lv1;

import java.util.Scanner;

/*https://programmers.co.kr/learn/courses/30/lessons/12954*/
public class Xspace2 {
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("정수 x를 입력");
            long x = sc.nextLong();
            System.out.println("정수 n을 입력");
            int n = sc.nextInt();
            long[] answer= new long[n];

            for(int i=0;i<n;i++){

                answer[i]= x*(i+1);
            }
            for(int i=0;i<n;i++){
                System.out.println(answer[i]);
            }



    }
}
