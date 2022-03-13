/* 0.07ms reduce 사용 */
const reduceAvg = (arr) => {
    var answer = arr.reduce((a,b)=> a+b)/arr.length;
    return answer;
}

/* 0.1ms 단순 계산 */
const mathAvg = (arr) => {
    var sum = 0;
    for(let a of arr){
        sum += a;
    }
    return sum/arr.length;
}

function solution(arr) {
    return reduceAvg(arr);
    //return mathAvg(arr);
}