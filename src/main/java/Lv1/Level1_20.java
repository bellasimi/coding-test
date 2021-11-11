package Lv1;

import java.util.Scanner;

public class Level1_20 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 n입력");
        int n = sc.nextInt();
        String answer="";

        for(int i=0;i<n;i++){
            if(i%2==0){
                answer+="수";
            }
            else{
                answer+="박";
            }

        }
        /*for(int i=0;i<n;i++){
            answer += i%2==0? "수":"박";
        }*/
        System.out.println(answer);
    }
}
