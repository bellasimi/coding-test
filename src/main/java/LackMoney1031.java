public class LackMoney1031 {
/*https://programmers.co.kr/learn/courses/30/lessons/82612*/

    public long solution(long price, long money, long count) {

        return Math.max(price*(count*(count+1)/2)-money,0);
    }

    public long solution2(long price, long money, long count) {
        long tprice = price*(count*(count+1)/2);
        long answer = 0;
        if(money<tprice){
            answer = tprice-money;
        }
        else{
            answer = 0;
        }
        return answer;
    }
}
