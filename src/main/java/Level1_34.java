import java.util.Arrays;

public class Level1_34 {
    public static void main(String[]args){
        int[][] sizes={{60,50},{30,70},{60,30},{80,40}};//sizes[4][2] 4칸 생성-> 이후 2칸씩 생성
        System.out.println(sizes.length);
        /*더 나은 풀이*/
        int result =Arrays.stream(sizes).reduce((a,b)-> new int[]{//reduce연산 모든 스트림 요소 해당 람다식 처리후 결과값 도출
                //int[][] 배열의 stream형태 인자는 BinaryOperator
                //두개의 같은 타입 인자(여기선 int[])로 받아 일한 타입으로 반환
                Math.max(Math.max(a[0],a[1]),Math.max(b[0],b[1])),
                Math.max(Math.min(a[0],a[1]),Math.min(b[0],b[1]))

        }).map(it->it[0]*it[1]).get();

        /*max min 초기화

        int max=0;
        int min=0;

        for(int[] size:sizes){
            int sMax= Math.max(size[0],size[1]);
            int sMin= Math.min(size[0],size[1]);

            max = max>sMax? max:sMax;
            min = min>sMin? min:sMin;

        }
        int result = min*max;

        */
/*        int[] row= new int[sizes.length];
        int[] col= new int[sizes.length];

        for(int i=0;i<sizes.length;i++){
            row[i]= Math.max(sizes[i][0],sizes[i][1]);
            col[i]= Math.min(sizes[i][0],sizes[i][1]);
        }
        Arrays.sort(row);
        Arrays.sort(col);


        int result = row[row.length-1]*col[col.length-1];*/

        System.out.println(result);


    }
}
