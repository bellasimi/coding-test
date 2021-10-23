import java.util.Scanner;
/*https://programmers.co.kr/learn/courses/30/lessons/12947/solution_groups?language=java*/
public class Hashad6 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 x값 입력:");
        int x = sc.nextInt();
        int x2 =x;
        int [] num = new int[(int) Math.log10(x)+1];
        int i =0;
        for(i=0;i<num.length;i++){

            num[i]=x2%10;
            x2 = Math.round(x2/10);

        }
        int sum = 0;
        for(i=0;i<num.length;i++){
            sum +=num[i];
        }
        if(x%sum==0){

            System.out.println("하샤드임");
        }
        else{
            System.out.println("아님");
        }

    }
}
