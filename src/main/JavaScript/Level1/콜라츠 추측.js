/* 평균 0.06ms 삼항 연산자 */
const trialCal = (num, answer = 0) => {
    while(num !== 1 && answer !== 500){
      num = num%2===0? num/2: num*3+1;
      answer++;
    }
    return num === 1? answer:-1;
}
/* 평균 0.08ms 삼항 연산자 + 재귀함수  */
const reCal = (num, answer = 0) => {
return num === 1? (answer>=500? -1: answer): (num%2===0? solution(num/2,++answer): solution(num*3+1,++answer));
}
/* 평균 0.08ms 일반 연산 조건문 */
const basicCal = (num) => {
    var answer = 0;

    while(num !== 1){
        if(num%2===0){
            num/=2;
            answer++;
        }else{
            num=num*3+1;
            answer++;
        }
        if(answer===500){
            answer=-1
            break;
        }

    }
    return answer;
}

function solution(num) {
    return trialCal(num);
    //return basicCal(num);
    //return reCal(num);
}