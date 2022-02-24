//https://programmers.co.kr/learn/courses/30/lessons/12945

function solution(n) {
    var answer = 0; // 피보나치 수열은 전의 a+b = c 가 차례대로 교체되서 나온다는 걸 알면 됨
    let n0 = 0;
    let n1 = 1;
    let a = 1;

    for(let i=2; i< n; i++){
        n0 = n1;
        n1 = a;
        if(a >=1234567){
          a = n0%1234567+ n1%1234567; //이렇게 작은 수의 연산으로 나눠서 더해야 시간 효율이 올라감
        }else{ //만약 1234567 보다 작으면 그 자체로 나머지임
          a = n0+ n1;
        }
        answer = a%1234567;
    }

    return answer;
}