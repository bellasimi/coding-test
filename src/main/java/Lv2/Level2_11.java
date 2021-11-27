package Lv2;

import java.util.Arrays;
import java.util.List;

public class Level2_11 {
    public static void main(String[]args){
        int[][] board = {{0,0,1,1},{1,1,1,1}};
        Level2_11 l = new Level2_11();
        System.out.println(l.solution(board));
    }
    public int solution(int [][]board)
    {
        int answer = 0;
        int index = 0;
        int[] widths = new int[board.length];
        for(int[] b:board){
            int width = 0;

            for(int i:b){
                if(i==1){
                    width++;

                }
            }
            System.out.println(width);
            widths[index] = width;
            System.out.println("너비 배열"+Arrays.toString(widths));

            index++;
        }
        //{2,4}

        int height = 1;
        for(int i=0;i<widths.length;i++){
            for(int j=i+1;j<widths.length;j++){
                if(widths[i]<=widths[j]){
                    height++;
                    System.out.println(widths[j]);
                }
            }
            System.out.println("높이"+height);
        }


        answer = height*height;
        return answer;
    }
}
