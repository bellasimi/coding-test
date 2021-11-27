package Lv2;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

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
        int x = board.length;
        int y = board[0].length;
        int max = 0;

        int[][] board2 = new int[x][y];

        for(int i=0;i<x;i++){
            board2[i][0] = board[i][0];
        }
        for(int j=0;j<y;j++){
            board2[0][j] = board[0][j];
        }
        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                int up = board2[i][j-1];
                int left = board2[i-1][j];
                int leftUp = board2[i-1][j-1];

                if(board[i][j] ==1){
                    board2[i][j] = Math.min(Math.min(up,left),leftUp)+1;
                }
                board2[0][j] = board[0][j];
            }

        }

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                answer = Math.max(answer,board2[i][j]);
            }
        }

        return answer*answer;
    }


}
