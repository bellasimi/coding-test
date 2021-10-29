import java.util.Arrays;
import java.util.Scanner;

/*https://programmers.co.kr/learn/courses/30/lessons/12932/solution_groups?language=java*/
public class Level1_14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력");
        long n = sc.nextLong();
        String str = String.valueOf(n);

        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        int [] strArr = new int[str.length()];
        for(int i=0;i<str.length();i++){
            strArr[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
        }


        System.out.println(str);
        System.out.println(sb);
        System.out.println(Arrays.toString(strArr));
    }
}
