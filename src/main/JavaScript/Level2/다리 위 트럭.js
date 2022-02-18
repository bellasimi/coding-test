//https://programmers.co.kr/learn/courses/30/lessons/42583?language=javascript
function solution(bridge_length, weight, truck_weights) {
    var answer = 0;
    let trucks = truck_weights.length;

    let bridge = Array.from({ length: bridge_length }, () => 0 );
    // bridge_length 길이 배열에 0값 넣은것 [0,0]
    let time = 0;

    while(bridge.length){ //[0,0] 다리위 배열 존재할 때까지 반복
        bridge.shift(); // 앞차 통과 차 한대값 다리에서 뺌
        time+=1; //차 한대 지나가면 +1시간

        if(truck_weights.length){//지나갈 트럭 배열이 존재한다면
            let sum = bridge.reduce((acc,truck) => acc+truck)
            //다리위 트럭들 무게
            if(sum + truck_weights[0] <= weight){
                //다리위 트럭들에 지나갈 트럭 무게 더해도 되면
                bridge.push(truck_weights.shift());
                //다리배열끝에 현재 트럭값 추가
            }else{//무게 초과면
                bridge.push(0)//0대 지나간다고 추가
            }
        }

    }

    return time;
}