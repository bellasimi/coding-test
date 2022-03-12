//https://programmers.co.kr/learn/courses/30/lessons/12950?language=javascript
function solution(arr1, arr2) {
    var answer = [];
    var len = arr1[0].length
    for(let i = 0; i< arr1.length; i++){
        let temp = [];
        for(let j = 0; j< len; j++){
            temp.push(arr1[i][j]+ arr2[i][j]);
        }
        answer.push(temp);
    }
    return answer;
}