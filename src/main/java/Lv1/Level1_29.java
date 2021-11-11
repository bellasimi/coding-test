package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level1_29 {
    public static void main(String[] args){
        int[] arr={1,1,1,2,3,3,4,4,4};
        List<Integer> list = new ArrayList<>();
        /* int num 현재배열 값으로 계속 초기화해서 이전배열과 비교*/
        int num=10; //절대 나오지 않을 10으로 0-9니까

        for(int i:arr){
            if(i!=num){
                list.add(i);
                num=i;
            }
        }
/* 조건문으로 현재배열값과 이전 배열 값 비교하기
        for(int i=0;i<arr.length;i++) {
            if(i==0){
                list.add(arr[0]);
            }
            else if(i>0&&arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }
        }*/

        System.out.println(list);
        int[] answer = new int[list.size()];
        /* 반복문으로 int 배열에 값넣기 */
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        /* Integer 배열에 넣은 뒤 int 배열로 바꾸기-> 비추 더 느림
        Integer[] Ilist = list.toArray(new Integer[list.size()]);
        int[] answer = Arrays.stream(Ilist).mapToInt(Integer::intValue).toArray();*/
    }

}
