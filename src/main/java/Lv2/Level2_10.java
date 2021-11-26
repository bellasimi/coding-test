package Lv2;

import java.util.Arrays;
import java.util.Stack;

public class Level2_10 {
    public static void main(String[]args){
        String s ="())(()";
        Level2_10 l = new Level2_10();
        System.out.println(l.solution(s));
    }
    boolean solution(String s) {
        boolean answer = true;
        long start = System.currentTimeMillis();
        /*Stack으로 풀이 최대 17ms

        Stack<Character> stack = new Stack<Character>();

        for(char c: s.toCharArray()){
            if(c==')'&& stack.size() ==0){
               return false;
            }
            else if(c==')'&&stack.size()>0){
                stack.pop();
            }
            else if(c=='('){
                stack.push(c);
            }

            System.out.println("값:"+stack);
            System.out.println("값:"+stack.size());
        }
        if(stack.size()>0){
            answer = false;
        }

        long end = System.currentTimeMillis();
        System.out.println("시간 :"+(end-start)+"ms");
        return answer;
*/
        /*char[] 사용 0.-ms 100점 최대 5.6ms*/
        char[] arrS = s.toCharArray();
        int sum = 0;
        if(check2(arrS[0],arrS[arrS.length-1])){
            for(char c: arrS){
                sum += c=='('? 1:-1;
                System.out.println(sum);
                if(sum<0){//sum이 -1되는 순간 )가 안닫히고 추가로 있는거임
                    return false;
                }
            }
            answer = sum==0? true:false;


        }
        else{
            answer = false;
        }

        return answer;
/*      String[] 사용 2ms 시간초과, 60점
        String[] arrS = s.split("");
        int sum = 0;
        System.out.println(check(arrS[0],arrS[arrS.length-1]));
        if(check(arrS[0],arrS[arrS.length-1])){
            for(String ss:arrS){
                sum += ss.equals("(")? 1:-1;
                System.out.println(sum);
            }
            answer = sum==0? true:false;
        }
        else{
            answer = false;
        }
*/

    }



    boolean check2(char c, char c2){
        boolean result = true;
        if(c=='('&&c2==')'){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }
    boolean check(String s, String s2){
        boolean result = true;
        if(s.equals("(")&&s2.equals(")")){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }
}
