public class Level1_31 {
    public static void main(String[]args){
        String s = "abcd";
        String answer = "";
        int begin = (s.length()-1)/2;
        int end = s.length()/2+1;
        System.out.println(begin);
        System.out.println(end);
        if(s!=null){
            answer = s.substring(begin,end);
        }

        /*
        int centerBegin= (int)Math.floor(s.length()/2.0);
        //s.length()의 반환값이 int이므로 그냥 2로 나누면 항상 정수형으로 값이 나와서. 올림 내림 값이 둘다 같다. 그러니 double로 만들어주자!
        int centerEnd= (int)Math.ceil(s.length()/2.0);

        if(s.length()%2==0){
            answer += s.substring(centerBegin-1,centerEnd+1);
            System.out.println(s.substring(centerBegin-1,centerEnd+1));
        }
        else{
            answer += s.substring(centerBegin,centerEnd);
            System.out.println(s.substring(centerBegin,centerEnd));
        }
*/
        System.out.println(answer);
    }
}
