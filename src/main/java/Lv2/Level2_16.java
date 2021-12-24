package Lv2;
/*
https://programmers.co.kr/learn/courses/30/lessons/42586*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Level2_16 {
    public static void main(String[] args){
        int[] progresses = {92,30,55};
        int[] speeds = {1,30,5};
        Level2_16 l = new Level2_16();
        System.out.println(l.solution(progresses,speeds));
    }
    public List<Integer> solution(int[] progresses, int[] speeds) {
        /*36.4점 for문 풀이*/

        List<Integer> list = new ArrayList<>(); // 같은날 배포되는 프로젝트의 수 리스트
        int[] answer = new int[progresses.length]; //끝나는 기간 배열
        /* 각각의  프로젝트가 끝나는 기간 배열 구하기 */
        for(int i = 0; i< progresses.length;i++){
            int pro = progresses[i];
            int time = 0;
            while(true){
                pro += speeds[i];
                time++;
                if(pro>=100){
                    answer[i] = time;
                    break;

                }//if

            }//while
        }//for
        //System.out.println(Arrays.toString(answer));

        for(int i=0; i< answer.length;i++){
            int cnt = 0;
            if(answer[i]<0){
                continue;
            }
            int done = answer[i];
            for(int j= 0; j< answer.length;j++){
                //System.out.println("done: "+done+" j: "+answer[j]);
                if(answer[j]<=done&&answer[j]>0){
                    answer[j] = -1;
                    cnt++;
                }

            }
            //System.out.println(Arrays.toString(answer));
            list.add(cnt);

        }

        return list;




/*        Stack<Integer> stack = new Stack<>();
        Stack<Integer> pro = new Stack<>();
        int done = 0;
        int cnt = 0;
        List<Integer> list = new ArrayList<>();

        for(int i=progresses.length-1;i>=0;i--){
            pro.push(i);
        }

        while(cnt!= progresses.length){

            for(int i=0;i< progresses.length;i++){

                progresses[i] += speeds[i];

                if(progresses[i] == 100){

                    stack.push(i);
                    cnt++;
                    if(pro.peek().equals(i)){
                        list.add(stack.size());
                        stack.clear();
                        pro.pop();
                    }
                }//if
            }//for
        }//while

        return list;*/
    }
}
