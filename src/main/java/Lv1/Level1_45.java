package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level1_45 {
    public static void main(String[]args){
        //String[] participant = {"mislav","mislav","stanko","ana"};
        //String[] completion = {"stanko","ana","mislav"};
        //List<String> loser = new ArrayList<String>(Arrays.asList(participant));

        //List<String> winner = new ArrayList<String>(Arrays.asList(completion));
        String[] participant = {"mislav","mislav","stanko","ana"};
        String[] completion = {"stanko","ana","mislav"};
        List<String> winner = Arrays.asList(completion);


        for(String c:completion){
            for(String p:participant){
                if(p==c){
                    winner.remove(p);
                }
            }
            System.out.println(winner);
        }


       //System.out.println(loser);
    }

}
