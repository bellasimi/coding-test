package Lv2;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

/*https://programmers.co.kr/learn/courses/30/lessons/12973*/
public class Level2_14 {

    public static void main(String[] args){
        String s = "baabaa";
        Level2_14 l = new Level2_14();
        System.out.println(l.solution(s));
    }

    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<Character>();

        char[] arr = s.toCharArray();

        /* Stack 80점 풀이*/
        stack.push(arr[0]);
        try {
            for (int i = 1; i < arr.length; i++) {
                System.out.println("top값 " + stack.peek() + " 행값 " + arr[i]);
                System.out.println(stack);
                if (stack.peek() != arr[i]) {
                    stack.push(arr[i]);
                } else if (stack.peek() == arr[i]) {
                    stack.pop();
                }

            }
        }catch (Exception e){

            answer = 1;

        }
        System.out.println(stack);
        answer = stack.size()>0?  0:1;


        return answer;
    }
}
