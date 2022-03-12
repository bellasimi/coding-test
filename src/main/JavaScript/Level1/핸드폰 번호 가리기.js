//https://programmers.co.kr/learn/courses/30/lessons/12948?language=javascript
/* for문 + substr 풀이 */
//평균 0.06ms 정도
const forCal = (numb) => {
    let len = numb.length-4
    var answer = '';
    for(let i = 0; i< len ; i++){
        answer += '*'
    }
    answer += numb.substr(len,4);
    return answer;
}

/* repeat() + slice */
//평균 0.04ms 얘가 더 빠르네
const reSlice = (numb) => {
    let len = numb.length-4; //이건 1부터 시작이라 -5가 아니라 -4임
    let answer = '*'.repeat(len) + numb.slice(-4);// slice 음수면 뒤에서 부터 -1 -2 이렇게임
    return answer;

}

function solution(phone_number) {
    return forCal(phone_number);
}