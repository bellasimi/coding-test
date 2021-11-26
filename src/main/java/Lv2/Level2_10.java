package Lv2;

public class Level2_10 {
    public static void main(String[]args){
        String s ="()()";
        Level2_10 l = new Level2_10();
        System.out.println(l.solution(s));
    }
    boolean solution(String s) {
        boolean answer = true;
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

        return answer;
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
