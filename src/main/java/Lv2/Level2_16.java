package Lv2;
/*
https://programmers.co.kr/learn/courses/30/lessons/42586*/
import java.util.*;

public class Level2_16 {
    public static void main(String[] args){
        int[] progresses = {92,55,30};
        int[] speeds = {1,5,30};
        Level2_16 l = new Level2_16();
        System.out.println(l.solution(progresses,speeds));
    }
    public int[] solution(int[] progresses, int[] speeds) {
        /* 스택 큐 풀이 */
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for(int i =0;i< speeds.length;i++){
            double remain = (100-progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);//해당 인덱스의 걸리는 기간

            if(!q.isEmpty() && q.peek()< date){//아래값보다 더 오래걸리면

                list.add(q.size());//기존 큐 값 개수 list에 추가
                q.clear();//큐 비우기
            }

            q.offer(date);// 값 추가 첫번째 프로젝트가 맨 아래

        }

        list.add(q.size());

        int[] answer = new int[list.size()];

        for(int i = 0;i< answer.length;i++){
            answer[i] =list.get(i);
        }

        return answer;
        /* list 풀이

        List<Integer> list = new ArrayList<>(); // 같은날 배포되는 프로젝트의 수 리스트
        int[] day = new int[speeds.length];//걸리는 기간

        for(int i = 0; i < speeds.length; i++){
            day[i] = (100-progresses[i])/speeds[i];
            if((100-progresses[i]) % speeds[i]!=0){
                day[i] += 1;
            }
        }

        int prev = day[0];
        int cnt = 1;

        for(int i = 1;i< day.length;i++){
            if(prev < day[i]){
                System.out.println(prev);
                list.add(cnt);
                cnt =1;
                prev =day[i];
            }else{
                cnt++;
            }
        }
        list.add(cnt);

        int[] answer = new int[list.size()];
        //answer = list.stream().mapToInt(Integer::intValue).toArray();
        for(int i = 0; i<list.size();i++){
            answer[i] = list.get(i);
        }
        System.out.println(list);

        return answer;

*/




        /*36.4점 for문 풀이*//*


        List<Integer> list = new ArrayList<>(); // 같은날 배포되는 프로젝트의 수 리스트
        int[] answer = new int[progresses.length]; //끝나는 기간 배열
        */
/* 각각의  프로젝트가 끝나는 기간 배열 구하기 *//*

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
*/




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
