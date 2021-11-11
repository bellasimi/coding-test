package Lv1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Array;
import java.util.Scanner;

public class StarArray1 {
    /*https://programmers.co.kr/learn/courses/30/lessons/12969*/


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("n의 값을 입력하시오");
            int n = sc.nextInt();
            System.out.println("m의 값을 입력하시오");
            int m = sc.nextInt();

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){

                    System.out.print("*");
                }
                System.out.println();
            }
        }


}
