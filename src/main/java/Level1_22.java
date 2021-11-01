public class Level1_22 {
    public static void main(String[]args){
        String[] seoul ={"Jane","Kim"};
        String answer ="";
        for(int i=0;i<seoul.length;i++){
            if(seoul[i]=="Kim"){
                answer +="김서방은 "+i+"에 있다.";
                break;
            }
        }
        System.out.println(answer);
    }
}
