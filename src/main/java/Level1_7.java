import java.util.Arrays;
import java.util.OptionalDouble;

public class Level1_7 {
    public static void main(String [] args){
        int [] arr = {1,2,3,4};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        double answer = (double)sum/arr.length; //이게 왜 자연수로 떨어지지? 10/2인데.....둘다 정수였기때문
        //정수끼리 계산은 정수로 결과가 나옴        System.out.println(sum);

        int [] array ={1,2,3,4};
        double average = Arrays.stream(array).average().orElse(0); // orElse안해주면 optionaldouble이 자료형인데...
        System.out.println(arr.length);
        System.out.println(answer);
        System.out.println(average);
    }
}
