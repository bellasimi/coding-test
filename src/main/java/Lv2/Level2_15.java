package Lv2;

import java.util.Arrays;
import java.util.Comparator;

public class Level2_15 {
    public static void main(String[] args){
        String[] phone_book = {"119","97674223","1195524421"};
        Level2_15 l = new Level2_15();
        System.out.println("정답: "+l.solution(phone_book));
    }

    public boolean solution(String[] phone_book) {

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
