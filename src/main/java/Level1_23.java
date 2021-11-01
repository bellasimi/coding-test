import java.util.Arrays;
import java.util.Scanner;

public class Level1_23 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("문자숫자를 1-8자리로 입력!");
        String s = sc.next();
        boolean answer=false;


        /* length, split() 사용 */
        answer = (s.length()==4||s.length()==6)&&(s.split("[0-9]").length==0)? true:false;
        System.out.println(Arrays.toString(s.split("[0-9]")));//만약 전부 숫자로만 이뤄져 있다면, 이 배열의 길이는 0임
        /* 정규식 풀이
        answer = s.matches("^[0-9]${4}|{6}")? true:false;
        */

        /*85점
                try{
            Integer.parseInt(s);
            answer=true;
        }
        catch(Exception e){
            answer=false;
            e.printStackTrace();
        }*/
        System.out.println(answer);
    }
}
