package Lv2;
/*https://programmers.co.kr/learn/courses/30/lessons/42577*/

import java.util.Arrays;
import java.util.Comparator;

public class Level2_15 {
    public static void main(String[] args){
        String[] phone_book = {"119","97674223","1195524421"};
        Level2_15 l = new Level2_15();
        System.out.println("정답: "+l.solution(phone_book));
    }

    public boolean solution(String[] phone_book) {
        int len = phone_book.length;
        boolean answer = true;
        Arrays.sort(phone_book);//이땐 앞자리로 정렬해야 loop를 덜돈다!

        for(int i = 0; i < len-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
                break;
            }

        }
        return answer;
/*      String len으로 Arrays.sort 이후 substring으로 접두어 판별 -> 테스트 통과 but 효율성 실패
        int len = phone_book.length;
        boolean answer = true;

        Arrays.sort(phone_book, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        for(int i = 0; i<len-1;i++){
            for(int j = i+1; j< len;j++){
                int lenJ = phone_book[j].length();

                if(phone_book[i].substring(0,lenJ).contains(phone_book[j])){

                    answer = false;
                    break;
                }

            }

        }

        return answer;*/
 /*    83점 풀이
      int len = phone_book.length;
        boolean answer = true;
        Arrays.sort(phone_book, Comparator.reverseOrder());

        for(int i = 0; i < len-1; i++){
           for(int j = i+1; j <len;j++){
               if(phone_book[i].contains(phone_book[j])){
                   answer = false;
                   break;
               }
           }

        }
        return answer;

  */
    }
}
