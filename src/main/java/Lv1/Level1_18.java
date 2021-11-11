package Lv1;

import java.util.Arrays;
/*https://programmers.co.kr/learn/courses/30/lessons/12926/solution_groups?language=java*/
public class Level1_18 {
    public static void main(String[]args){
        String s = "Z z";
        int n =1;

        char [] cArr = s.toCharArray();
        System.out.println(cArr);
        int [] iArr = new int[cArr.length];
        for(int i=0;i<cArr.length;i++){
            if(cArr[i]!=' '&&cArr[i]<=90){
                iArr[i] = (int)cArr[i]+n;
                if(iArr[i]>90){
                    iArr[i] = 64+(iArr[i]-90);
                }
            }

            else if(cArr[i]!=' '&&cArr[i]>=97){
                iArr[i] = (int)cArr[i]+n;
                if(iArr[i]>122){
                    iArr[i] = 96+(iArr[i]-122);
                }
            }

            cArr[i] = (char)iArr[i];

        }

        String answer ="";
        for(int i =0; i<cArr.length;i++){

            answer += (int)cArr[i]==0? ' ':cArr[i];
        }
        System.out.println(Arrays.toString(iArr));
        System.out.println(cArr);
        System.out.println(answer);

    }
}
