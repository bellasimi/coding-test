package Lv1;

import java.util.*;

public class Level1_43 {
    public static void main(String[]args){
        int[] answer = {1,3,2,4,2};
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int i = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        while(i<answer.length){
            cnt1 += answer[i]==one[i]? 1:0;
            cnt2 += answer[i]==two[i]? 1:0;
            cnt3 += answer[i]==three[i]? 1:0;

            i++;
        }

        Map<Integer,Integer> score = new HashMap<Integer,Integer>();

        score.put(1,cnt1);
        score.put(2,cnt2);
        score.put(3,cnt3);

        System.out.println(score);

        int result = score.entrySet().stream().max((entry1,entry2)-> entry1.getValue()> entry2.getValue()? 1:-1).get().getKey();
/*        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(score.entrySet());
        list.stream().sorted(Map.Entry.comparingByValue());*/
        System.out.println(result);


    }

}
