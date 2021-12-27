package Lv2;

import java.util.Stack;

public class Level2_18 {
    public static void main(String[] args){
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        Level2_18 l =new Level2_18();
        System.out.println(l.solution(bridge_length,weight,truck_weights));
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        Stack<Integer> stack = new Stack<>();
        /* 트럭 무게 stack에 넣기 */
        int first = truck_weights[0];
        for(int i=truck_weights.length-1;i>=1;i--){
            stack.push(truck_weights[i]);
        }
        System.out.println(stack);

        /* stack에 담기 트럭들 배열에 담는데 걸리는 시간*/
        while(!stack.isEmpty()){

            System.out.println("first: "+first+" stack: "+stack);
            if(first+stack.peek()<=10){
                System.out.println("조건1 : "+first+" + "+stack.peek());
                stack.pop();
                first = stack.peek();
                answer+=bridge_length*2-1;
                System.out.println(answer);
            }
            else {
                System.out.println("조건2 : "+first);
                first = stack.peek();
                stack.pop();
                answer+=bridge_length;
                System.out.println(answer);
            }

        }


        return answer;
    }
}
