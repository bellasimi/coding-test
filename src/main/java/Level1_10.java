import java.util.Scanner;
/*https://programmers.co.kr/learn/courses/30/lessons/12937/solution_groups?language=java&type=my*/
public class Level1_10 {

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();

        String answer = num%2==0? "Even":"Odd";
        System.out.println(answer);
    }
}
