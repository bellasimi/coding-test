import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level1_32 {

    public static void main(String[]args){
        int n= 5;
        int[] arr1={9,20,28,18,11};
        int[] arr2={30,1,21,17,28};

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
        }


        System.out.println(Arrays.toString(answer));
    }
}
