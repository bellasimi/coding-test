//https://programmers.co.kr/learn/courses/30/lessons/12948?language=javascript
const forCal = (numb) => {
    let len = numb.length-4
    var answer = '';
    for(let i = 0; i< len ; i++){
        answer += '*'
    }
    answer += numb.substr(len,4);
    return answer;
}

function solution(phone_number) {
    return forCal(phone_number);
}