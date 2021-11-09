public class Level1_38 {
    /*https://programmers.co.kr/learn/courses/30/lessons/68935/solution_groups?language=java*/
    public static void main(String[]args){
        long n = 45;
        long na = 0;
        long mok = 1;
        /*문자열을 해당 진법으로 parseInt()*/
        long s = System.nanoTime();
        String answer="";
        while(n>=1){
            na = n%3;
            n/=3;
            answer += na;

        }
        int result = Integer.parseInt(answer,3);

        long e = System.nanoTime();

        System.out.println(answer);
        System.out.println(result);
        System.out.println(e-s);//41200


        /* List<Integer> 에 담기
        long s = System.nanoTime();
        List<Long> three = new ArrayList<Long>();
        while(n>=1){
            na = n%3;
            n/=3;
            three.add(na);
        }
        long answer =0;
        int cnt=three.size()-1;
        for(long i: three){
            answer += i*Math.pow(3,cnt);
            cnt--;
        }

        long e = System.nanoTime();
        System.out.println(answer);
        System.out.println(e-s);//377400
*/
/* 60점
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
        */

    }
}
