package Lv2;

public class Level2_19 {
    public static void main(String[] args){
        long n = 3;
        Level2_19 l = new Level2_19();
        System.out.println(l.solution(n));
    }
    public String solution(long n) {
        StringBuilder answer = new StringBuilder();
        String result = "";
        long first = n;
        while(n>0){
            answer.append(n%3);
            n/=3;
        }
        answer.reverse();
        if(first%3==0){
            result = answer.substring(0,answer.length()-2)+"4";
            //System.out.println(result);
        }else{
            result = answer.toString();
        }

        return result;
    }
}
//3-4,6-124,9-124124