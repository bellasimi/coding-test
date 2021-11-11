package Lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*https://programmers.co.kr/learn/courses/30/lessons/12933/solution_groups?language=java*/
public class Level1_13 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("n은 1이상 8000000000 이하의 자연수");
        long n = sc.nextLong();
        int i =0;

        String str = String.valueOf(n);
        String answer ="";
        char[] strarr =new char[str.length()];
        for(i=0;i<str.length();i++){
            strarr[i] = str.charAt(i);
        }
        Arrays.sort(strarr);
        for(i=str.length()-1;i>=0;i--){
           answer += strarr[i];
        }
        n = Long.parseLong(answer);

/*  이건 37점
        int ten = (int)Math.log10(n);//10의 몇자리냐?승으로 구해줌
        Integer [] arr = new Integer[ten+1];
        int i =0;
        int []round = new int[ten+1];
        for(i=ten;i>=0;i--){
            round[i] = (int)Math.pow(10,i);
            arr[i] = Math.toIntExact(n % 10);
            n= n/10;

        }

        Arrays.sort(arr);
        for(i=0;i<=ten;i++){
            n+= arr[i]*round[i];

        System.out.println(Arrays.toString(round));
        System.out.println(Arrays.toString(arr));
        }*/
        System.out.println(strarr);
        System.out.println(n);
    }
}
