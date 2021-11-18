package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

public class Level1_49 {
    public static void main(String[]args){
        int[] numbers ={1,2,3,4,6,7,8,0};
        Level1_49 l = new Level1_49();
        System.out.println(l.solution(numbers));
    }
    public int solution(int[] numbers) {
/*  합에서 numbers 값들만 빼면 되는 풀이 600*/
        long s =System.nanoTime();
        int answer =45;
        for(int n:numbers){
            answer -= n;
        }

        long e = System.nanoTime();
        System.out.println(e-s);

        return answer;




/*  List 스트림 풀이 34773900
       int answer = 0;
       List<Integer> list = new ArrayList<Integer>();
        Arrays.stream(numbers).forEach(n->list.add(n));

        for(int i=0;i<10;i++){
            if(!list.contains(i)){
                answer+=i;
            }
        }
        */
/* Arrays.stream() 풀이 37720100
    int answer = 45 - Arrays.stream(numbers).sum();

*/
/* IntStream풀이 최악 38837400
        int answer =IntStream.range(0,10).filter(i-> Arrays.stream(numbers).noneMatch(n->n==i)).sum();
*/


    }

}
