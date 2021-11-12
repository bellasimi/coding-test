package Lv1;

import java.util.*;
import java.util.stream.Collectors;

public class Level1_40 {
    public static void main(String[]args){

        int N= 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        int[] fail = new int[N];
        int[] user = new int[N];
        int users = stages.length;//전체 유저수
        //int[] failure = new int[N];



        /* 오름차순 정렬 */
        Arrays.sort(stages);

        /* 해당 스테이지 유저수 구하기 */
        for(int i=0;i< stages.length;i++){
            if(stages[i]>N){
                continue; //게임 다 클리어한 경우
            }
            user[stages[i]-1]++; //해당 스테이지 1이면 배열 인덱스 0에 1씩 더해줘라


        }

        Map<Integer,Double> map = new HashMap<Integer, Double>();

        /* 실패율 구하기 */
        for(int i=0;i<N;i++){
            double failure = (users==0)? 0:user[i]/(double)users;
            map.put(i+1,failure);
            users -= user[i];//이러면 i스테이지 이상의 유저들로 계속 초기화됨
        }

        /* 내림차순을 해주기 위해 List화 */
        List<Map.Entry<Integer,Double>> list = new LinkedList<>(map.entrySet());

        /* value기준 내림차순, 인덱스 기준 오름차순 정렬 */
        Collections.sort(list, new Comparator<Map.Entry<Integer,Double>>(){
            @Override
            public int compare(Map.Entry<Integer,Double>o1, Map.Entry<Integer,Double>o2){
                if(o2.getValue()-o1.getValue()>0){//첫번쨰 param < 두번째 param
                    return 1;//o2가 큰경우 1
                }
                if(o2.getValue()-o1.getValue()<0){//첫번쨰 param > 두번쨰 param
                    return -1;//o1이 큰경우 -1
                }
                return o1.getKey()-o2.getKey(); //값이 같으면 key값을 오름차순으로
            }

        });

        System.out.println(list);


        int i = 0;
        for(Iterator<Map.Entry<Integer,Double>> iter = list.iterator(); iter.hasNext();){
            Map.Entry<Integer,Double> entry = iter.next();
            fail[i++]=entry.getKey();
        }

        System.out.println("실패율"+Arrays.toString(fail));
    }
}
