//https://programmers.co.kr/learn/courses/30/lessons/87390


function solution(n, left, right) {
    var arr =[]
    var answer = [];
/* 좌표로 풀이 */

/* left~right만 좌표를 구함*/
    while(left<=right){
        answer.push(Math.max(Math.floor(left/n),left%n)+1)
        left++;
    }
    return answer;
/*  시간 초과 원인: 전체 다 좌표 구한 뒤 slice(left,right+1)한게 문제
    for(let r=0; r<n; r++){
        for(let c=0; c<n; c++){

            answer.push(Math.max(r,c)+1)
        }
    }
    return answer.slice(left,right)

    }
