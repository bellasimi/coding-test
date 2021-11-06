import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://programmers.co.kr/learn/courses/30/lessons/17681/solution_groups?language=java
public class Level1_32 {

    public static void main(String[]args){
        int n= 5;
        int[] arr1={9,20,28,18,11};
        int[] arr2={30,1,21,17,28};
/* 함수 이용 */
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);//2진수로  변환
            //arr1[i] | arr2[i]하면 두개가 겹친 형태로 나옴 1001,1101->1101, 1000,1-.1001,1101,1111->1111
        }
        for(int i = 0; i< n; i++){
            answer[i] = String.format("%"+n+"s",answer[i]);//n개의 문자형식 %s는 문자형식 -> %5s는 5개의 문자형식
            answer[i] = answer[i].replaceAll("1","#");
            answer[i] = answer[i].replaceAll("0"," ");//replace와 replaceAll 차이: replaceAll은 정규식이 올 수 있고
            //String s =aabbddcccabc 이런애들에서 abc를 공백으로 바꿀 때
            // s.replace("abc","")=="aabbddccc" vs s.replaceAll("[abc]","")=="dd"
            //순서가 무작위 abc문자 각각 전부 없애 준다.

        }

/*      나의 풀이: 이진법을 구한뒤 조건문처리 너무 코드가 복잡해
        List<StringBuilder> twoList1 = new ArrayList<>();
        List<StringBuilder> twoList2 = new ArrayList<>();

        int na1=0;
        int mok1=0;
        int na2=0;
        int mok2=0;


        for(int i=0;i<n;i++){

            mok1= arr1[i];
            mok2= arr2[i];
            String two1 = "";
            String two2 = "";
            while(mok1>0){
                na1= mok1%2;
                mok1 = mok1/2;
                two1 += na1;
            }
            while(mok2>0){
                na2= mok2%2;
                mok2 = mok2/2;
                two2 += na2;
            }

            while(two1.length()<n){
                two1 +="0";
            }
            while(two2.length()<n){
                two2 +="0";
            }
            StringBuilder sb1 = new StringBuilder(two1);
            StringBuilder sb2 = new StringBuilder(two2);
            sb1.reverse();
            twoList1.add(sb1);
            sb2.reverse();
            twoList2.add(sb2);
        }

        System.out.println(twoList1);
        System.out.println(twoList2);



        String[] answer =new String[n];

        for(int i=0;i<n;i++){
            String ss="";
            for(int j=0;j<n;j++){
                if(twoList1.get(i).charAt(j)==twoList2.get(i).charAt(j)){
                    ss+=twoList1.get(i).charAt(j)=='1'? "#":" ";
                }
                else{
                    ss+="#";
                }
            }
            answer[i] = ss;
        }*/

        System.out.println(Arrays.toString(answer));
    }
}
