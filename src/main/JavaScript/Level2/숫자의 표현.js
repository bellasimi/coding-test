function solution(n) {
    var answer = 1; // 자기 자신이 포함되니까 그거 생각해서 미리 1로 초기화
    let start = 1;
    while(start<n){ //시작값이 n이상이면 그만
        let sum = 0;
        for(let i=start; i<n; i++){//시작값에서 n미만까지 숫자 순회
            sum+=i; //순회값 다 더해서
            if(sum === n){ //합이 n이면 정답이니까 answer에 1더하고 for문 나와서 start+1한 다음 while문부터 다시 반복
                answer+=1;
                break;
            }else if( sum > n){
                break; //합이 n보다 커지면 안돼!
            }

        }
        start+=1;//1부터 n 미만까지 나오도록함
    }


    return answer;
}