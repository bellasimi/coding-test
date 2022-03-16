function solution(n) {
    let arr = String(n).split('');//정수 n을 문자로 치환 후 각자리수를 쪼개서 배열값으로 만듬
    arr.sort((a,b) => b-a);// 내림차순 정렬
    var answer = '';//문자
    arr.map(e => answer+=e);//arr 큰수부터 차례로 문자로 인식 => answer에 문자 덧붙이기

    return Number(answer);//asnwer를 정수로 치환
}