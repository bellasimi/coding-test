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

    return splitFor(n);
}