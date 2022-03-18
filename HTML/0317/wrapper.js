console.log(1);

const num_a = 10;
console.log(num_a.toString());
console.log(num_a.toString(2)); // 2진수로 변환
console.log(num_a.toString(8));
console.log(num_a.toString(10));
console.log(num_a.toString(16));

console.log(num_a.toFixed(2)); // 10.00 소수점 아래 두번째 자리까지

const num_b = 10.005;
console.log(num_b.toFixed(2)); // 10.01 반올림해서 두번짜 자리까지 만듬. 자르지않음
