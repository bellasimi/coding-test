package Lv2;

import java.util.Arrays;
import java.util.Stack;

public class Level2_10 {
    public static void main(String[]args){
        String s ="()))((()";
        Level2_10 l = new Level2_10();
        System.out.println(l.solution(s));
    }
    boolean solution(String s) {
        boolean answer = true;
        boolean warn = true;
        long start = System.currentTimeMillis();
        /*Stack으로 풀이 */

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
        }
        if(stack.size()>0){
            answer = false;
        }


        /*char[] 사용 0.-ms 5,11번 통과가 안돼.. ,92점
        char[] arrS = s.toCharArray();
        int sum = 0;
        if(check2(arrS[0],arrS[arrS.length-1])){
            for(char c: arrS){
                sum += c=='('? 1:-1;
                System.out.println(sum);
                if(sum<-1){
                    warn = false;
                    break;
                }
            }
            answer = sum==0&&warn==true? true:false;


        }
        else{
            answer = false;
        }

*/
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

        long end = System.currentTimeMillis();
        System.out.println("시간 :"+(end-start)+"ms");
        return answer;
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
