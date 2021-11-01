import java.util.Scanner;

public class Level1_23 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("문자숫자를 1-8자리로 입력!");
        String s = sc.next();
        boolean answer=false;

        if(s.matches("[a-z]{1,8}")){
               answer=false;
        }else{
            answer=true;
        }
        System.out.println(answer);
        /*85점
                try{
            Integer.parseInt(s);
            answer=true;
        }
        catch(Exception e){
            answer=false;
            e.printStackTrace();
        }*/

    }
}
