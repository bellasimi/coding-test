import java.util.Arrays;

public class Level1_38 {
    public static void main(String[]args){
        long n = 45;
        long na = 0;
        long mok= 1;
        String threeReverse="";

        while(mok>0){
            mok = n/3;
            na = n%3;
            n = n/3;
            threeReverse += na;//어짜피 거꾸로 들어가니까 reverse()안해줘도 돼!
        }

        //45의 3진법 수: 1200 -> 거꾸로 0021
        int ten = Integer.parseInt(threeReverse);// 그냥 parseInt하면 10진법 되는거 아닌가? 아니네... 21로 찍히네?
        int answer =0;

        int i=0;
        while(ten>0){
              answer += ten%10*Math.pow(3,i);
              ten = ten/10;
              i++;
        }
        System.out.println(threeReverse);
        System.out.println(answer);
    }
}
