package Lv1;

import java.util.Scanner;

public class Level1_8 {
/*https://programmers.co.kr/learn/courses/30/lessons/12943/solution_groups?language=java&type=my*/
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        int answer = 0;
        while(num!=1){ //while은 조건문이 true면 반복 false면 멈춤
            num = num%2==0? num/2:num*3+1;
            answer ++;
        }
        answer = answer>500? -1:answer;
        System.out.println(answer);
    }
}
