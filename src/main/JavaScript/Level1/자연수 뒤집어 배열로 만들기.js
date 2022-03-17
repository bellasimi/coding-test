//https://programmers.co.kr/learn/courses/30/lessons/12932?language=javascript
/* 0.04ms 수학적 풀이 */
const mathWhile = (n) => {
    answer =[];
    do {
        answer.push(n%10);
        n = Math.floor(n/10);
    }while(n>0)
    return answer;
}

/* 0.05ms 문자 split 하고 revese(), map()으로 정수변환*/
const splitMap = (n) => {
    return String(n).split('').reverse().map(e => Number(e));
}
/* 0.07ms 문자 split 하고 for문 인덱스 거꾸로 push*/
const splitFor = (n) => {
    var answer = [];

    let arr = String(n).split('');

    for(var i = arr.length-1; i>= 0; i--){
        answer.push(Number(arr[i]));
    }
    return answer;
}


function solution(n) {
    return mathWhile(n);
    //return splitMap(n);
    //return splitFor(n);
}