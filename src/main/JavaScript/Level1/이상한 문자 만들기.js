const splitUpper = (s) => {
    let flag = 0;
    let answer = '';

    let arr = s.toLowerCase().split('')

    for(let i =0; i< arr.length; i++){

        if(arr[i]=== ' '){
            flag = -1;
        }
        if(flag%2===0){
            answer += arr[i].toUpperCase();
        }else{
            answer += arr[i];
        }

        flag++;
    }

    return answer;
}


function solution(s) {

    return splitUpper(s);
}