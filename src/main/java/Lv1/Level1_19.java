package Lv1;

public class Level1_19 {
    /*https://programmers.co.kr/learn/courses/30/lessons/12925/solution_groups?language=java*/
    public static void main(String[]args){
        String s = "-1234";
        String answer ="";
        Boolean con=false;

        /* 한줄 풀이
        int result= s.matches("\\+?[1-9][0-9]{0,4}")? Integer.parseInt(s): Integer.parseInt(s.replace("-",""))*-1;*/
        int result=0;

        for(char c:s.toCharArray()){
            if(c=='-'){
                con=false;
            }
            else if(c!='+'){
                con=true;
            }
        }

        result = con==false? Integer.parseInt(s)*-1: Integer.parseInt(s);

        System.out.println(answer);
        System.out.println(result);
    }

}
