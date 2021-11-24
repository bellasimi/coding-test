package Lv2;

public class Level2_7 {
    public static void main(String[]args){
        int n = 15;
        Level2_7 l = new Level2_7();
        System.out.println(l.solution(n));
    }
    public int solution(int n) {
        int answer = 0;
        int start = 1;
        while(start<=n){
            int sum =0;
            for(int i=start;i<=n;i++){
                sum += i;
                if(sum==n){
                    answer++;
                    break;
                }
                else if(sum>n){//이걸 안해주면 반복문을 더 돔!!
                    break;
                }
            }
            start++;
        }


/*      등차수열 활용 70점 효율성에서 30감점

        int answer = 1;
        for(int i = 1; i<n; i++){
            for(int j = i+1; j<n;j++){
                if((j-i+1)*(j+i)==2*n){
                    //System.out.println("i:"+i+"j:"+j);
                    answer++;
                }
            }
        }*/
        return answer;
    }
}
