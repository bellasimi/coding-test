/* 0.1ms 단순 계산 */
const mathAvg = (arr) => {
    var sum = 0;
    for(let a of arr){
        sum += a;
    }
    return sum/arr.length;
}

function solution(arr) {

    return mathAvg(arr);
}