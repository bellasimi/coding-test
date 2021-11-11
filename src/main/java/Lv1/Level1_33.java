package Lv1;

public class Level1_33 {
    public static void main(String[]args){
        int n= 12;
        int na =1;
        int x =1;
        /* 더 나은 풀이 */
        while(n%x!=1){
            x++;
        }

/*        for(int i=2;i<=Math.sqrt(n-na);i++){
            if((n-na)%i==0) {
                x = i;
                break;
            }
            else{//이거 해줘야 1의 몫 n-na가 포함됨!
                x=n-na;
            }
        }
        */
        System.out.println(x);



    }
}
