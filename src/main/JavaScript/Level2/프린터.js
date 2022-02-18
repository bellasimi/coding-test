//https://programmers.co.kr/learn/courses/30/lessons/42587?language=javascript

function solution(priorities, location) {
    var answer = 0;
    let copy = [...priorities]
    let priorityQ = copy.sort((a,b) => a-b)
    //console.log(priorities)
    while(priorityQ.length > 0){
        for(let i=0; i< priorities.length; i++){
            let p = priorityQ[priorityQ.length-1];
            //console.log('p'+p)
            if(p===priorities[i]){
                //console.log('prio'+priorities[i])
                //console.log('i'+i)
                if(i === location){
                //console.log(answer)
                    answer++;
                    return answer;
                }
                priorityQ.pop();
                answer++;
            }
        }
    }
    return answer;
}