/* 평균 0.06ms 100점 while + 계산 */
//일단 x값이 훼손되면 안되니까 temp에 담고, while문으로 temp가 1이상이면 temp를 10으로 계속 나누고 반내림을 함,
//temp를 10으로 나누기전 10으로 나눈 나머지가 해당 자릿수임.
const whileMath = (x) => {
    let d = 0;
    let temp = x;

    while(temp>=1){
        d += temp%10;//10으로 나눈 나머지는 1의 자릿수임 근데 -> 자릿수를 하나씩 뺀 다음이라 모든 자릿수를 순환
        temp = Math.floor(temp/10);//자릿수를 하나씩 뺌 반내림을 해야 소숫점이된 자릿수를 버림
    }

    var answer = x%d === 0;
    return answer;
}

/* 평균 0.06ms 100점 String.split+ Number */
//배열의 길이를 반복하도록해야해... 아래처럼 len 따로 구하면 부정확하네...
//그리고 +''대신 String으로 자료형 변환해주고
// 조건문만으로 true false 되네...
function splitString(x) {
    let sum = 0;
    let arr = String(x).split('');
    for(let i =0; i< arr.length; i++){
        sum+= Number(arr[i]);
    }
    var answer = x%sum === 0;
    return answer;
}

/* 평균 0.1ms 정확도 52점 */
//숫자 x를 문자열로 바꾸고 배열로 만든 다음 배열 값을 int로 만들어서 자릿수 합 구함.
//그리고 x를 나눌 수 있는 지 확인
const splitNumb = (x) => {
    let len = Math.floor(x/10+1);
    let d = 0;
    let arr = (x+'').split('');
    for(let i =0; i< len; i++){
        d+= Number(arr[i]);
    }
    var answer = x%d === 0;
    return answer;
}



function solution(x) {
    return whileMath(x);
    //return splitString(x);
    //return splitNumb(x);
}