const splitUpper = (s) => {
    var answer = '';
    s.toLowerCase().split('').map((e,i) => {

        if(i%2 === 0 ){
            answer+= e.toUpperCase();
        }else{
            answer+= e
        }

    })
    return answer;
}

function solution(s) {

    return splitUpper(s);
}