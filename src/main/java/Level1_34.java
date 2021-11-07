import java.util.Arrays;

public class Level1_34 {
    public static void main(String[]args){
        int[][] sizes={{60,50},{30,70},{60,30},{80,40}};//sizes[4][2] 4칸 생성-> 이후 2칸씩 생성
        System.out.println(sizes.length);
        int[] row= new int[sizes.length];
        int[] col= new int[sizes.length];

        for(int i=0;i<sizes.length;i++){
            row[i]= Math.max(sizes[i][0],sizes[i][1]);
            col[i]= Math.min(sizes[i][0],sizes[i][1]);
        }
        Arrays.sort(row);
        Arrays.sort(col);


        int result = row[row.length-1]*col[col.length-1];
        System.out.println(result);


    }
}
