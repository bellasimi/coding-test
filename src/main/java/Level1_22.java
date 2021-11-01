import java.util.Arrays;

public class Level1_22 {
    public static void main(String[]args){
        String[] seoul ={"Jane","Kim"};
        int index=Arrays.asList(seoul).indexOf("Kim");

        String answer ="김서방은 "+index+"에 있다";
/*
        String answer ="";
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                answer +="김서방은 "+i+"에 있다.";
                break;
            }
        }*/
        System.out.println(answer);
    }
}
