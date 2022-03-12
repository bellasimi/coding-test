//https://programmers.co.kr/learn/courses/30/lessons/12950?language=javascript

/* map으로 배열 돌며 계산하는 방식 */
//for문보다 이게 더 느림 최대 4ms 차이남
const mapCal = (arr1, arr2) =>
  arr1.map((row, y) =>
    row.map((e, x) => e + arr2[y][x]));

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
    //return mapCal(arr1, arr2);
}