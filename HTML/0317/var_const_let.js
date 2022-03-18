let a = 1;
let b = 2;
var c = 3;
var d = 4;

if (true) {
  let a = 5;
  //   var b = 6; SyntaxError
  let c = 7;
  var d = 8;
}

console.log(a); // let + 함수_let // 지역변수 (스코프: 함수 내부) -> 함수 밖 영향 x
console.log(b); // let + 함수_var // 문법에러
console.log(c); // var + 함수_let // 지역변수 (스코프: 함수 내부)
console.log(d); // var + 함수_var // 전역변수 (static 처럼)

// 결론
// var 전역변수
// const 상수
// let 지역변수

// ES6(2015년 개정 발표 자바스크립트 버전) 부터 const 와 let 가 추가 되었으며
// 변수의 스코프를 줄이고 오류 발생 가능성을 낮추기 위해
// 지금은 const 와 let 를 권장한다고 합니다
