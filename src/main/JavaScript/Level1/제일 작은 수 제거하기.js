/* 평균 0.07ms 빠른 풀이 splice + indexOf + Math.min */
const mathIdx = (arr) => {
    arr.splice(arr.indexOf(Math.min(...arr)),1);//splice는 기존 배열을 변화시킴,
    //반환값은 삭제 후 배열이 아니라 삭제한 값이라서 arr를 return하지않고 arr.splice를 return하면 삭제값인 최소값이 들어감!!
    return arr.length? arr: [-1];// arr.splice대신 arr 써야됨!!!!
}
/* Math.min + filter */
const mathFilter = (arr) => {
    var answer = [];
    let min = Math.min(...arr);
    answer = arr.filter(e=> e!==min)
    return answer.length<1? [-1]: answer;
}

function solution(arr) {
    return mathFilter(arr);
}