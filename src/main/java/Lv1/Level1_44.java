package Lv1;
/*https://programmers.co.kr/learn/courses/30/lessons/42748/solution_groups?language=java*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Level1_44 {
    public static void main(String[]args){
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

/*   list 풀이 속도 느림
     List<Integer> answer = new ArrayList<Integer>();
        int[] result = new int[commands.length];
        for(int[] c: commands){

            List<Integer> list = new ArrayList<Integer>();
            for(int i = c[0]-1;i<c[1];i++){
                list.add(array[i]);
            }
            Collections.sort(list);
            answer.add(list.get(c[2]-1));


        }
        int[] result2 = answer.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result2));
        System.out.println(answer);
        */


        int[] answer = new int[commands.length];

        for(int i=0; i< commands.length;i++){
            int[] temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }


        System.out.println(Arrays.toString(answer));

    }

}
