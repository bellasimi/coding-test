package Lv1;

public class Level1_39 {
    public static void main(String[]args){
        int left = 24;
        int right = 27;
        int answer = 0;
        for(int i=left;i<=right;i++){

            if(Math.sqrt(i)==(int)Math.sqrt(i)){
                answer -= i;
            }
            else{
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
