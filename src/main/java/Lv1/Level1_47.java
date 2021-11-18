package Lv1;

public class Level1_47 {
    public static void main(String[]args){
        Level1_47 l = new Level1_47();
        int[] a ={1,2,3,4};
        int[] b ={-3,-1,0,2};
        System.out.println(l.Solustion(a,b));
    }

    public int Solustion(int[] a, int[] b){
        int answer =0;
        for(int i =0;i< a.length;i++){
            answer+=a[i]*b[i];
        }
        return answer;
    }

}
