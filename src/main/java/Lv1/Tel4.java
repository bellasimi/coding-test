package Lv1;

import java.util.Arrays;
import java.util.Collections;

public class Tel4 {


    public static void main(String[] args) {
        int answer = 0;
        long needs=0;
        long budget =10;
        int [] d={1,2,3,4};

        for(int i=0;i<d.length;i++){
            needs +=d[i];

            if(needs>budget){
                break;
            }

            answer++;
            System.out.println(needs);
        }
        System.out.println(answer);
    }
}
