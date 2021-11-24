package Lv2;

import java.util.Arrays;

public class Level2_6 {
    public static void main(String[]args){
        String s = "4 -3 1 -4 0 -5";
        //String s = "-1 -2 -3 -4";
        Level2_6 l = new Level2_6();
        System.out.println(l.solution(s));
    }
    public String solution(String s) {
        /*int[] 변환 후 -> Arrays.sort() -> 첫번째값, 마지막값 더하기  13ms*/


        String answer = "";

        String[] ss = s.split(" ");
        //Arrays.sort(ss);// 굳이 int[]로 안바꿔도 숫자 대소 구분 가능
        // , 근데 -인경우만 몰라... -를 0보다 작다고 인식은 하는데.. 거기서 그냥 -1 -2 이렇게 오름차순하네..
        //System.out.println(Arrays.toString(ss));
        int[] nums = new int[ss.length];
        for(int i=0;i<ss.length;i++){
            nums[i] = Integer.parseInt(ss[i]);
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        answer += nums[0];
        answer += " "+nums[nums.length-1];
        return answer;


/*      int[]변환 후 Arrays.stream().max -> 너무 시간 오래걸려 13ms


        String[] ss = s.split(" ");
        int[] nums = new int[ss.length];
        for(int i=0;i<ss.length;i++){
            nums[i] = Integer.parseInt(ss[i]);
        }
        answer += Arrays.stream(nums).min().getAsInt();
        answer += " "+Arrays.stream(nums).max().getAsInt();
*/



/*      Integer.parseInt(arrS[i]) 일일이 비교해서 min max 구하기 최대 15ms 별로 안빠름


        String[] arrS = s.split(" ");
        int max =Integer.parseInt(arrS[0]);
        int min =Integer.parseInt(arrS[0]);

        for(String ss:arrS){
            int n = Integer.parseInt(ss);
            if(max<n){
                max = n;
            }
            if(min>n){
                min = n;
            }
        }

        answer += min;
        answer += " "+max;*/


    }




}
