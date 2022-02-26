//https://programmers.co.kr/learn/courses/30/lessons/12939?language=javascript

function solution(s) { //java로 풀 땐 String 음수정수 정렬이 안돼서 for문 안 조건문으로 max,min 비교 했으나 js는 그럴 필요 없음.
    var answer = '';
    let arr = s.split(' ')//각각 숫자 배열로 담기
    arr.sort((a,b)=> a-b)//오름차순 정렬 -> 음수 양수 전부 정렬해줌
    answer += arr[0]+' '+arr[arr.length-1]// 최솟값 + ' '+최댓값
    return answer;
}