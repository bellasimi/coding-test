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
    var answer = x%d === 0? true: false;
    return answer;
}

function solution(x) {

    //return splitNumb;
}