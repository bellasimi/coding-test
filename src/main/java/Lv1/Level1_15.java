package Lv1;

import java.util.Scanner;
/*https://programmers.co.kr/learn/courses/30/lessons/12931/solution_groups?language=java*/
public class Level1_15 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력");
        long n = sc.nextLong();
        int sum = 0;
        while(n>=1){
            sum +=n%10;
            n/=10;
            System.out.println(n);
            System.out.println(sum);
        }
        System.out.println(sum);

    }
}
