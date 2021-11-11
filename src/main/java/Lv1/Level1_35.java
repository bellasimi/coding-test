package Lv1;

import java.time.DayOfWeek;
import java.time.LocalDate;
/*https://programmers.co.kr/learn/courses/30/lessons/12901/solution_groups?language=java*/

public class Level1_35 {
    public static void main(String[]args){
        int a=11;
        int b=10;
        LocalDate day = LocalDate.of(2021,a,b);
        System.out.println(day);//2021-11-10
        DayOfWeek dayName = day.getDayOfWeek();
        System.out.println(dayName);//WEDNESDAY
        String answer = dayName.toString().substring(0,3);
        System.out.println(answer);//WED
    }


}
