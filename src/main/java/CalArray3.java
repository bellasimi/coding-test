public class CalArray3 {

    public static void main(String [] args){
        int [][]arr1= {{1,2},{2,3}};
        int [][]arr2= {{3,5},{1,9}};

        int r = arr1.length;
        int c = arr1[0].length;

        int [][] answer = new int [r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                answer [i][j] =arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println(answer);
    }

}
