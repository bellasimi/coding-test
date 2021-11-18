package Lv1;

public class Level1_48 {
    public static void main(String[]args){
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        Level1_48 l = new Level1_48();
        System.out.println(l.solution(absolutes,signs));

    }

    public int solution(int[] absolutes,boolean[] signs){
        int answer = 0;

        for(int i=0; i<absolutes.length;i++){

            answer += signs[i]? absolutes[i]:-absolutes[i];
            //answer += absolutes[i]*(signs[i]? 1:-1);
            //answer += signs[i]==true? absolutes[i]:(-1)*absolutes[i];
        }

        return answer;
    }

}
