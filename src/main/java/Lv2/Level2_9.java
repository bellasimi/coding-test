package Lv2;

public class Level2_9 {
    public static void main(String[]args){
        int n = 8;
        Level2_9 l = new Level2_9();
        System.out.println(l.solution(n));
    }
    public int solution(int n) {
        int cntOne = 0;
       /*쉽게 2진법 전환 */
        String bi = Integer.toBinaryString(n);
        System.out.println(Integer.toBinaryString(n));

        char[] arrBi = bi.toCharArray();
        for(char c: arrBi){
            if(c =='1'){
                cntOne++;
            }
        }
        System.out.println(cntOne);

        int answer = n+1;

        while(true){
            System.out.println(answer);
            String bi2 = Integer.toBinaryString(answer);
            System.out.println(bi2);
            char[] arrBi2 = bi2.toCharArray();
            int cntOne2 = 0;
            System.out.println(arrBi2);
            for(char c: arrBi2){
                if(c =='1'){
                    cntOne2++;
                }
            }


            System.out.println(cntOne2);
            if(cntOne2==cntOne){
                break;
            }

            answer++;
        }


/*      무식하게 2진법 바꾸기

        int na = 0;
        StringBuilder bi = new StringBuilder();
        while(n>0){
            na = n%2;
            n /=2;
            bi.append(na);
        }
        bi = bi.reverse();
        System.out.println(bi);*/
        return answer;
    }
}
