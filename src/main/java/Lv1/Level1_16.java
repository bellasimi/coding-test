package Lv1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
/*https://programmers.co.kr/learn/courses/30/lessons/12930/solution_groups?language=java*/
public class Level1_16 {
    public static void main(String[]args){
        /*Scanner sc = new Scanner(System.in);
        String s = sc.next();*/
        String s = "hello world my name is Shin";
        String [] sArr = s.split("");

        int cnt =0;
        String answer = "";
        for(String ss:sArr){
            cnt = ss.contains(" ")? 0:cnt+1;
            answer += cnt%2!=0? ss.toUpperCase():ss.toLowerCase();
        }

/*     60점대 풒이
       String [] sArr = s.split(" ");
        String answer ="";
        for(int i=0;i<sArr.length;i++){
            for(int j=0;j<sArr[i].length();j++){

                if(j%2==0){
                    answer += Character.toUpperCase(sArr[i].charAt(j));
                    System.out.println(answer);
                }
                else{
                    answer += Character.toLowerCase(sArr[i].charAt(j));
                    System.out.println(answer);
                }
            }
            if(i!=sArr.length-1){
                answer+=" ";
            }
        }

        System.out.println(Arrays.toString(sArr));
        System.out.println(s);*/
        System.out.println(answer);

    }

}
