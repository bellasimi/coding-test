/* 평균 0.07ms while 계산 */
const basicCal = (n, m) => {
    var answer = [];
    let min = Math.min(n,m);
    let max = Math.max(n,m);
    let multi = min*max;
    while(min>0){
        let r = min;
        min = max%min;
        max = r;

    }
    answer.push(max);
    answer.push(multi/max);

    return answer;
}
/* 평균 0.07ms for 계산 */
const forCal = () => {
   var r;
   for(var nm= n*m;r = n % m;n = m, m = r){} //r = n % m로 true false 판별 true라면 계속 반복
   return [m, nm/m];
}

function solution(n, m) {

   return basicCal(n,m);
}