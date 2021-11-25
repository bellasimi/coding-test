package Lv2;

public class Level2_9 {
    public static void main(String[]args){
        int n = 8;
        Level2_9 l = new Level2_9();
        System.out.println(l.solution(n));
    }
    public int solution(int n) {

        /* oneCnt(int n) 함수 따로 뺴서 1 cnt 325400ns*/
        //함수를 따로 빼는게 효육적이군
        int cnt = oneCnt(n);
        int answer = n+1;
        while(true){

            if(cnt==oneCnt(answer)){
                break;
            }

            answer++;
        }

        return answer;
        
        /*while문에서 1 직접 cnt  시간초과 510500ns*//*


         *//*쉽게 2진법 전환 *//*

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

*/

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
    }

    public int oneCnt(int n){
        String bi = Integer.toBinaryString(n);
        char[] arrBi2 = bi.toCharArray();
        int cntOne = 0;
        for(char c: arrBi2){
            if(c =='1'){
                cntOne++;
            }
        }
        return cntOne;
    }
}
