package Lv1;

import java.util.Locale;

public class Level1_25 {
    public static void main(String[]args){
        String s="pPooYy";
        boolean flag= false;
        /*람다식*/
        s = s.toUpperCase();
        flag = s.chars().filter(i-> i=='P').count() == s.chars().filter(i-> i=='Y').count()? true:false;

       /* chars()는 문자열을 char형으로 스트림 가능하게 해줌 아래 기능을 한줄에 담았다고 보면됨, 람다식 i가 아래 순환하는 i같은 기능임.
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='P') {
                 cntP++;
             }
             else if(s.charAt(i)=='Y'){
                 cntPY++;
             }
             flag = cntP!=cntY? false:true;
         }   */




        /*정규식 + replace(),length()

        flag =s.replace("[^yY]","").length()-s.replace("[^pP]","").length()==0? true:false;
        */

        /* 빠른 for문 풀이

        int cntP=0;
        int cntY=0;
        for(char c:s.toCharArray()){
            if(c=='p'||c=='P'){
                cntP++;
            }
            else if(c=='y'||c=='Y'){
                cntY++;
            }
            flag = cntP!=cntY? false:true;
        }*/
        System.out.println(flag);
    }
}
