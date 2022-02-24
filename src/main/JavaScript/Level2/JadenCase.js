function solution(s) {
    var answer = '';
    let arr =s.toLowerCase().split('')
    let flag = true;//띄어쓰기 찾는 변수
    //console.log(arr)
    for(let i=0; i< arr.length; i++){
        answer += flag? arr[i].toUpperCase(): arr[i];
        //띄어쓰기 다음일 때는 대문자, 아니면 소문자
        flag = arr[i] === ' '? true : false;
        //띄어쓰기로 flag 스위치
    }
    return answer;
}