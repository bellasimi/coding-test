package Lv2;
/*https://programmers.co.kr/learn/courses/30/lessons/12913*/
import java.util.Arrays;

public class Level2_8 {
    public static void main(String[]args){
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        Level2_8 l = new Level2_8();
        System.out.println(l.solution(land));
    }
    int solution(int[][] land) {
        int answer = 0;
        int max = 0;
        int row = 0;
        int maxIndex = 3;
        for(int[] arr:land){
            Arrays.sort(arr);
            //System.out.println(Arrays.toString(arr));
            if(maxIndex < arr.length-1){
                answer += arr[maxIndex];
                //System.out.println(arr[maxIndex]);
                maxIndex++;
            }
            else if(maxIndex == arr.length-1){
                answer += arr[maxIndex];
                //System.out.println(arr[maxIndex]);
                maxIndex--;
            }


/*            if(arr[maxIndex]!=max){
                answer += arr[maxIndex];
                max = arr[maxIndex];
            }
            else{
                answer += arr[maxIndex-1];
                max = arr[maxIndex-1];

            }*/
/*            if(arr[maxIndex]>max){
                max = arr[maxIndex];
                continue;
            }

            row++;
            System.out.println(max);
            System.out.println(row);*/
        }

        return answer;
    }
}
