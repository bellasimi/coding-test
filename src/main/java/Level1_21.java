import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Level1_21 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 n을 입력!");
        int n = sc.nextInt();

        int answer =0;


       for(int i=2;i<=n;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=2;j<=n;j++){

                //i%j==0인 경우의 개수가 1이면 소수
                if(i%j==0) list.add(j);
            }

            System.out.println(i);
            System.out.println(list);
            answer += list.size()==1? 1:0;
        }

        System.out.println(answer);
    }
}
