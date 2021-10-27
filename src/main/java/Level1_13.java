import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Level1_13 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("n은 1이상 8000000000 이하의 자연수");
        long n = sc.nextLong();
        int ten = (int)Math.log10(n);//10의 몇자리냐?승으로 구해줌
        Integer [] arr = new Integer[ten+1];
        int i =0;
        int []round = new int[ten+1];
        for(i=ten;i>=0;i--){
            round[i] = (int)Math.pow(10,i);
            arr[i] = Math.round(n/round[i]);
        }
       for(i=ten;i>=0;i--){
            round[i] = (int)Math.pow(10,i);
            arr[i] = Math.round(n/round[i]);
        }

        Arrays.sort(arr);
        for(i=0;i<=ten;i++){
            n+= arr[i]*round[i];
        }
        System.out.println(n);
    }
}
