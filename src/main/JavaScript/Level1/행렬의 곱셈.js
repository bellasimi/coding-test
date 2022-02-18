//https://programmers.co.kr/learn/courses/30/lessons/12949?language=javascript

function solution(arr1, arr2) {
/* map reduce 사용 */
arr1.map((row)=> arr2[0].map((x,y) => row.reduce((acc,cur,i) => acc + cur*arr2[i][y],0 )))

/*  for문 풀이
    let r = arr1.length;
    let c = arr1[0].length;
    let r2 = c;
    let c2 = arr2[0].length;

    let answer = [];

    for(let i=0; i < r; i++){

        let arr =[];
        for(let k=0; k< c2 ; k++){
            let rVal = 0;
            for(let j=0; j < c; j++){
                rVal += arr1[i][j]*arr2[j][k];
            }
            arr.push(rVal)
        }
        answer.push(arr)
    }

    return answer;*/
}

/*
행렬 곱셈 시 앞 행렬의 열과 뒷 행렬의 행의 수가 같아야 한다.
2x3 3x2 는 곱셈 가능
2x3 1x2 는 불가능

계산시
앞 행렬의 열 === 뒷 행렬의 행

[[a,b,c], [[1,2],
[d,e,f]] * [3,4],
           [5,6]]

계산후
크기 == 앞행렬의 행 x 뒷 행렬의 열
2x2
[[1a+3b+5c, 2a+4b+6c],
 [1d+3e+5f, 2d+4e+6f]]

*/