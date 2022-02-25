//https://programmers.co.kr/learn/courses/30/lessons/12941

function solution(A,B){
    var answer = 0

    A.sort((a,b)=> a-b )//배열을 오름차순으로 정렬
    B.sort((a,b)=> b-a )//내림차순으로 정렬

    for(let i=0; i< A.length; i++){
        answer += A[i]*B[i]// 최대값과 최솟값 순으로 곱해서 계속 더하면 됨
    }


    return answer;
}