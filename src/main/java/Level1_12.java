public class Level1_12 {
/*https://programmers.co.kr/learn/courses/30/lessons/12934/solution_groups?language=java&type=all*/
    public static void main(String[]args){
        long n = 20;
        int x =2;

        Double answer = Math.sqrt(n);//제곱근 구하기
        String type =String.valueOf(answer);//문자열로 변환
        long xx = (long) Math.pow(x,2);//x의 제곱구하는 Math함수
        System.out.println(Math.floor(answer));//4.0
        System.out.println(Math.round(answer));//4

        if(Math.floor(answer)!=answer||answer.isInfinite()){
            System.out.println(-1);
        }
        else{
            System.out.println((x+1)*(x+1));
        }
    }
}
