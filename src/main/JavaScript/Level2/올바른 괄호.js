//https://programmers.co.kr/learn/courses/30/lessons/12909
function solution(s){
    var answer = false;

    let cnt = 0;

    if(s[0]===')'|| s[s.length-1] === '('){
        return false;// 시작이 ) 거나 끝이 ( 이면 그냥 false
    }else{ // 시작과 끝이 ()로 잘 닫힌 경우

    for(let i of s){
        cnt += i==='('? 1:-1; //( 와 )의  개수 맞추기 )가 (보다 더 많으면 false
        if(cnt<0){
            return false;
        }
    }

    }
    if(cnt === 0) return true; // +- 개수 맞을 때만 true

    return answer;
}