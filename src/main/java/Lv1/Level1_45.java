package Lv1;

import java.util.*;
import java.util.stream.Collectors;

public class Level1_45 {
    public static void main(String[]args){
        String[] participant = {"mislav","stanko","ana","mislav"};
        String[] completion = {"stanko","ana","mislav"};
        String answer ="";

        Map<String,Integer> game = new HashMap<String,Integer>();
        //게임 참가자 이름을 키, 완주여부를 값으로 갖는 map 만들기(완주:0 완주실패:1 )
        for(String p: participant){
            game.put(p,game.getOrDefault(p,0)+1);//해당값이 있으면 그 키에 해당값+1, 없으면 0+1
        }
        for(String c: completion){
            game.put(c,game.get(c)-1);//어짜피 key값 중복 안되서 이렇게 put 하면 기존값에 -1됨
        }
        System.out.println(game);
        //이제 값이 0이 아닌 애를 찾으면 됨!

        //answer = game.entrySet().stream().filter(g->g.getValue()!=0).map(Map.Entry::getKey).collect(Collectors.joining());
        Iterator<Map.Entry<String,Integer>> iter = game.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,Integer> entry = iter.next();
            if(entry.getValue() != 0){
                answer = entry.getKey();
            }
        }

        System.out.println(answer);

    }


    public String solution(String[] participant, String[] completion) {
        String answer = "";
        return answer;
    }

}
