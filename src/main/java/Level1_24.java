import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Level1_24 {

    public static void main(String[]args){
        String s = "bAcCaA";
        String answer="";
        /*stream 사용*/
        Stream.of(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());


        System.out.println(answer);

        /*StringBuilder reverse() 사용

        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        for(char c:sArr){
            answer+=c;
        }
        StringBuilder sb = new StringBuilder(answer);
        System.out.println(sb.reverse().toString());

        //위에 대신에 new StringBuilder(new String(sArr)).reverse().toString())이렇게 한줄 입력도 가능
        // String 생성자 변수에 char 배열값 담김
        */


        /* 느린 답


        Character[]sArr = new Character[s.length()];
        for(int i=0;i<s.length();i++){
            sArr[i]=s.charAt(i);
        }

        Arrays.sort(sArr,Collections.reverseOrder());
        for(char c:sArr){
            answer+=c;
        }

        * */



       /* String up="";
        String low="";
        String answer="";
        for(char c:s.toCharArray()){
            if(c>=97){//여기서 잘못 생각함!! 97부터 시작하는건 소문자였네;; 대문자 아니고 이렇게 어렵게 풀 문제가 아님
                up+=c;
            }
            else{
                low+=c;
            }
        }
        System.out.println(up);
        System.out.println(low);
        char [] uArr =up.toCharArray();
        char [] lArr =low.toCharArray();
        Arrays.sort(uArr);
        Arrays.sort(lArr);
        for(char c:uArr){
            answer+=c;
        }
        for(char c:lArr){
            answer+=c;
        }*/

    }
}
