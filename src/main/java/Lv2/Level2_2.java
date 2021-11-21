package Lv2;

import java.util.Locale;

public class Level2_2 {
    public static void main(String[] args){
        String s = "3people unFollowed me";
        Level2_2 l = new Level2_2();
        System.out.println(l.solution(s));
    }
    public String solution(String s) {
        String answer = "";
        int index=0;
        /*s를 전부 돌면서 " "나올 때마다 index 0으로 만들기 4ms 18점*/
        s = s.toLowerCase();
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                index =0;
            }
            System.out.println(index);
            if(i==0){
                if(!checkNum(s.substring(0,1))) {
                    s = s.replaceFirst(s.substring(0,1),s.substring(0,1).toUpperCase());
                }
            }
            else if(i!=0&&index==0){
                if(!checkNum(s.substring(i + 1, i + 2))) {
                    s = s.replaceFirst(s.substring(i + 1, i + 2), s.substring(i + 1, i + 2).toUpperCase());
                }
            }
            index++;
        }

        answer = s;
        return answer;


        /* split()-> +=로 붙이기 잘못된 풀이 13ms 43점
        s = s.toLowerCase();
        String[] arrS = s.split(" ");
        for(int i=0;i< arrS.length;i++){
            if(!checkNum(arrS[i])){
                arrS[i] = arrS[i].replaceFirst(arrS[i].substring(0,1),arrS[i].substring(0,1).toUpperCase());

            }
            System.out.println(arrS[i]);
            if(i==0){
                answer += arrS[i];
            }
            else{
                answer += " "+ arrS[i];
            }
        }
        */
    }

    public boolean checkNum(String a){
        boolean flag = a.substring(0,1).matches("[0-9]");
        return flag;
    }
}

