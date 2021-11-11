package Lv1;

import java.util.Scanner;

public class Telmozaic5 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("폰번호를 입력하시오");
        String s = sc.next();

        int leng = s.length();

        System.out.println(leng);

        char[] answer = s.toCharArray();

        for(int i=0;i<leng-4;i++){
            answer[i] = '*';
        }
        System.out.println(String.valueOf(answer));

        /* 이방법은 너무 느림
        String star="";
        String replace = s.substring(0,leng-4);
        for(int i=0;i<replace.length();i++){
            star+="*";
        }
        replace.replace(replace,star);

        System.out.println(star+s.substring(leng-4,leng));
        */


        /* 이건 자바 11부터 가능
        String change = s.substring(0,leng-4);
        String star = "*";
        System.out.println(s.replace(change,star.repeat(change.length())));//이건 자바11부터 가능*/

    }
}
