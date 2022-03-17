//https://programmers.co.kr/learn/courses/30/lessons/12931?language=javascript
/* 0.05ms Math, while 수학적 풀이 */
const mathWhile = (n) => {
    var answer = 0;
    do {
        answer += n%10;
        n = Math.floor(n/10);
    }while(n>0)
    return answer;
}
/* 0.05ms String split reduce */
const splitReduce = (n) => {
    return String(n).split('').reduce((a,e) => a + parseInt(e),0);//0으로 a를 초기화해야 정수로 인식해
}
function solution(n){
    return mathWhile(n);
    // return splitReduce(n);
}