//https://programmers.co.kr/learn/courses/30/lessons/12953
function solution(arr) {

    arr.sort((a,b)=> a-b);// 오름차순 정렬

    let min = arr[0]; // 최솟값
    let max = arr[arr.length-1]; //최댓값
    let answer = max* min; // 최소공배수 == 두 수의 곱 / 최대 공약수

    while(min!=0){ //최대공약수(max,min) == (min,max%min) 나머지가 0이 아닐 때까지 max%min을 min 값으로
        let r = min;
        min = max%min;
        max = r;
    }

    answer /= max; //위 while문 돌고 나온 max값이 최대 공약수 => 즉 얘는 위 최소*최대/최대공약수로 나눈 값임
    //console.log(max);
    for(let i=0; i< arr.length; i++){// 그치만 배열 중간 값의 최소공배수는 아닐 수 있어서 또 반복문을 돌림

        if(answer%arr[i] !== 0){//위 answer가 배열 중간 값들로 나눠지지 않으면
            max = answer;
            min = arr[i];

            while(min!=0){ // 또 다시 최대 공약수를 찾아서
                let r = min;
                min = max%min;
                max = r;
            }

            answer = answer*arr[i]/max; // 해당값/최대공약수를 answer에 곱함
        }
    }

    return answer;
}