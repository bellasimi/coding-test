package Lv1;


import java.util.HashMap;
import java.util.Map;
/*https://programmers.co.kr/learn/courses/30/lessons/67256*/
public class Level1_50 {
    public static void main(String[]args){
        String hand ="right";
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        Level1_50 l = new Level1_50();
        System.out.println(l.solution(numbers,hand));
    }
    public String solution(int[] numbers, String hand) {
        String answer = "";

        /* Map 사용 15점*/
        Map<String,Integer> place = new HashMap<String,Integer>();
        for(int n:numbers){
            System.out.println("번호: "+n);
            if(n==1||n==4||n==7){
                answer+="L";
                place.put("l",n);
            }
            else if(n==3||n==6||n==9){
                answer +="R";
                place.put("r",n);
            }
            /*int l =place.get("l");
            int r = place.get("r");

            System.out.println(l);
            System.out.println(r);*/
            else {
                int rV = place.get("r");// null값인 경우 자동 언박싱이 안돼 ㅠㅜ
                int lV = place.get("l");
                if (Math.abs(n - lV) == Math.abs(n - rV) || Math.abs(n - lV) == 1 && Math.abs(n - rV) == 3 || Math.abs(n - lV) == 3 && Math.abs(n - rV) == 1) {
                    answer += hand.toUpperCase().substring(0, 1);

                    place.put(hand.substring(0, 1), n);
                }else {
                    if (Math.abs(n - lV) == 1 || Math.abs(n - lV) == 3 || Math.abs(n - lV) == 0) {
                        answer += "L";
                        place.put("l", n);
                    } else if (Math.abs(n - rV) == 1 || Math.abs(n - rV) == 3 || Math.abs(n - lV) == 0) {
                        answer += "R";
                        place.put("r", n);
                    }


                }
            }
            System.out.println("place: "+ place);
        }

        return answer;

    }
}