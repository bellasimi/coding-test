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
    return basicCal(num);
}