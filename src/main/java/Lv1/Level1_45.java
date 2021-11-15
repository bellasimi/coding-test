package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Level1_45 {
    public static void main(String[]args){
        String[] participant = {"mislav","stanko","ana","mislav"};
        String[] completion = {"stanko","ana","mislav"};

        Arrays.sort(participant);
        Arrays.sort(completion);

        List<String> player = new ArrayList<String>(Arrays.asList(participant));
        String answer="";
        List<String> winner = new ArrayList<String>(Arrays.asList(completion));


        for(String p:participant){
            if(winner.contains(p)){
               player.remove(p);
               winner.remove(p);
            }
        }
        answer = player.get(0);

        System.out.println(player);
        System.out.println(answer);
    }

}
