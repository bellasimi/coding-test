package Lv1;

import java.util.*;
import java.util.stream.Collectors;

public class Level1_36 {
    public static void main(String[]args){
        int[] numbers = {2,1,3,4,1};
        /*TreeSet 사용: HashSet쓰면 정렬은 안되고 중복만 가리는데 얘는 둘다함*/
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(i!=j){
                    set.add(numbers[i]+numbers[j]);
                }
            }
        }

        int[] answer =set.stream().mapToInt(Integer::intValue).toArray();


        /* list로 받아서 구하는 경우 -> distinct()로 나중에 중복값 걸러주고 sort()나 sorted() 따로 해줘야됨
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(i!=j){
                   list.add(numbers[i]+numbers[j]);
                }
            }
        }

        list.sort(Comparator.comparing(Integer::intValue));

        int[] answer = list.stream().distinct().mapToInt(Integer::intValue).toArray();*/
        System.out.println(Arrays.toString(answer));
    }
}
