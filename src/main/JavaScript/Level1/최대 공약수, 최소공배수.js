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

function solution(n, m) {

   return basicCal(n,m);
}