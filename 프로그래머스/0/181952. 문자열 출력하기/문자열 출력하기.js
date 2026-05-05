// 콘솔에서 입력받기 위한 인터페이스를 제공하는 모듈
const readline = require('readline');

// 연결된 입출력 채널을 만든 것
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// 입력받은 데이터를 저장할 변수
let input = [];

// 한 줄 입력
rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    console.log(str);
});