//https://programmers.co.kr/learn/courses/30/lessons/12973
function solution(s)
{
    var answer = -1;
    let stack = []; //Stack 처럼 배열을 사용해서

    for(let i of s){
        if(stack.length === 0 || stack[stack.length-1] !== i){
            stack.push(i); // 만약 첫값이면 stack배열에 넣고,
            //그 이후엔 stack배열 마지막 값과 i의 값이 다를 때만 stack에 push
        }else{
            stack.pop();//stack에 값이 존재하고 마지막 값과 i가 다르면 stack 마지막 값 제거
        }
    }

    answer = stack.length === 0? 1:0; //stack의 길이가 0이면 1 아니면 0

    return answer;
}