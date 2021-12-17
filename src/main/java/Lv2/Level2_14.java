package Lv2;

import java.util.ArrayList;
import java.util.List;

/*https://programmers.co.kr/learn/courses/30/lessons/12973*/
public class Level2_14 {

    public static void main(String[] args){
        String s = "baabaa";
        Level2_14 l = new Level2_14();
        System.out.println(l.solution(s));
    }

    public int solution(String s)
    {
        int answer = -1;
        String[] arr = s.split("");
        List<String> list = new ArrayList<String>();

        for(int i=1;i<arr.length;i++){

            System.out.println("배열값"+ arr[i-1]+ " "+ arr[i]);

            if(!arr[i].equals(arr[i-1])){
                list.add(arr[i-1]);
                System.out.println("배열값"+ arr[i-1]+ " "+ arr[i]);
            }
        }
        System.out.println(list);
        answer = list.size()>0?  0:1;


        return answer;
    }
}
