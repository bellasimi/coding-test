function solution(n) {
    let answer = Number.isInteger(Math.sqrt(n));
    let x = Math.sqrt(n);
    return answer? (x+1)*(x+1) : -1;
}