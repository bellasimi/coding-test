//https://programmers.co.kr/learn/courses/30/lessons/12911

function solution(n) {
    var answer = 0;
    let binary = n.toString(2); //2진수로 변환시 toString(2) 사용
    let next = n+1;

    while(answer<1){ // 현재 0인데 답이 나오면 0보다 커짐 그런 경우 while문 종료
        let cnt = binary.split('1').length -1; //2진법에서 1이 몇개 인지 cnt
        if(cnt === next.toString(2).match(/1/g).filter(e=> e !== '').length){
            answer = next; //1의 갯수가 그 다음 2진법 변환 수 1의 갯수와 같으면 다음수를 반환
        }
        next+=1;
    }

    return answer;
}
/* 2진법 수 1의 갯수 구하는 방법

.toString(2).split('1').length -1
.toString(2).match(/1/g).filter(e => e !== '').length
*/