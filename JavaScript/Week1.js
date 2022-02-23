function colorPatternTimes(input){
    let time = 0;
    for(let i = 0; i< input.length; i++){
        time++;time++;
        if(time > 2 & input[i-1]!=input[i]){
            time++;
        }
    }
    return time;

}


console.log(colorPatternTimes(["Red", "Blue", "Red", "Blue", "Red"])); //should be 14
console.log(colorPatternTimes(["Blue"])); //should be 2
console.log(colorPatternTimes(["Red", "Yellow", "Green", "Blue"])); //should be 11
console.log(colorPatternTimes(["Blue", "Blue", "Blue", "Red", "Red", "Red"])); //should be 13
console.log(colorPatternTimes(["Blue", "Yellow", "Blue", "Blue", "Red", "Red", "Green"])); //should be 18