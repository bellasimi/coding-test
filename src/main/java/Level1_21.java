import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Level1_21 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 n을 입력!");
        int n = sc.nextInt();
        int answer=0;

       for(int i=2;i<=n;i++){
            List<Integer> list = new ArrayList<>();//i마다 리셋
            for(int j=1;j<=Math.sqrt(i);j++){ //j를 제곱근까지로 정한 이유는 약수는 제곱근을 기준으로 +-되기 때문.
                /* j는 1이 아니고 j(i의 제곱근까지)로 현재값 i를 나눌수 있다면 i는 소수가 아님(소수는 1과 자신만을 약수로 가짐)*/
                if(j!=1&&i%j==0){ list.add(j);}
            }
            System.out.println(list);
            answer += list.size()==0? 1:0;
        }
        System.out.println(answer);
    }
}
