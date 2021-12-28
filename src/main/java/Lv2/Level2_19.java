package Lv2;
/*https://programmers.co.kr/learn/courses/30/lessons/12899*/
public class Level2_19 {
    public static void main(String[] args){
        int n = 9;
        Level2_19 l = new Level2_19();
        System.out.println(l.solution(n));
    }
    public String solution(int n) {
/*        String answer = "";
        while(n>0){
            System.out.println(n);
            if(n%3==0){
                answer = "4" +answer;
                n-=3;
            }else{
                answer = Long.toString(n%3) + answer;
            }
            n /=3;
        }
        return answer;*/
        String[] num = {"4","1","2"};
        String answer ="";

        while(n>0){
            answer = num[n%3]+ answer;
            n = (n-1)/3;
        }
        return answer;
    }
}
//3-4,6-124,9-124124