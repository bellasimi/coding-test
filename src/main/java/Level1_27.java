public class Level1_27 {
    public static void main(String[]args){
        long a= 3;
        long b= 5;
        long answer=0;
        /*등차수열의 합*/
        long min = Math.min(a,b);
        long max = Math.max(a,b);

        answer =(max-min+1)*(min+max)/2;

/*        if(a==b){
            answer=a;
        }
        else{
            for(long i=Math.min(a,b);i<=Math.max(a,b);i++){
                answer +=i;
            }
        }*/

        System.out.println(answer);
    }
}
