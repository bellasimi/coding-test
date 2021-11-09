import java.util.Arrays;
/*https://programmers.co.kr/learn/courses/30/lessons/12982/solution_groups?language=java*/
public class Level1_37 {
    public static void main(String[]args){
        long[] d= {1,3,2,5,4};
        long budget=9;
        int sum=0;
        int answer= 0;
        Arrays.sort(d);
        for(int i=0;i<d.length;i++){
            sum += d[i];
            if(sum>budget){
                answer = i;
                break;
            }
            else{
                answer = i+1;
            }
        }

        System.out.println(answer);
    }
}
