import java.util.*;
/*https://programmers.co.kr/learn/courses/30/lessons/12915/solution_groups?language=java*/
public class Level1_26 {

    public static void main(String[]args){
        String[] strings = {"sun","bed","card","car"};
        int n=1;
        /* 먼저 사전식으로 정렬 후 n값만 따로 정렬*/
        Arrays.sort(strings);
        Arrays.sort(strings,Comparator.comparing(i->i.charAt(n)));

        System.out.println(Arrays.toString(strings));
        /* n~s끝까지 단어로 정렬
        Arrays.sort(strings,Comparator.comparing(s-> s.substring(n,s.length())));

         */
        /*중복이 있는지 따로 구하지 않고 그냥 n번째 문자를 앞에 붙여서 정렬-> substring으로 그문자 제거 해주면 끝!
        List<String> list =new ArrayList<>();

        for(String s:strings){
            list.add(s.charAt(n)+s);
        }

        String[] answer =new String[strings.length];
        Collections.sort(list);
        for(int i=0;i< answer.length;i++){
            answer[i] = list.get(i).substring(1);
        }

        System.out.println(Arrays.toString(answer));
         */




    }



}
