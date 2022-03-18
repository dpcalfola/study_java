// document.write("test");

// message_1 = "hello";
// console.log("1: " + message_1);
// console.log("2: " + typeof message);
// console.log("3: " + typeof "sage");
// console.log("4: " + 1);
// console.log("5: " + typeof 1);

// // NaN ==> Not A Number
// // NaN => 어떤 값과도 일치하지 않으며, 심지어 NaN끼리도 일치하지 않음
// // isNaN => NaN 값을 구분
// console.log(NaN == NaN); // false
// console.log(isNaN(NaN)); // true    => NaN 자체임
// console.log(isNaN(10)); // false    => 숫자임
// console.log(isNaN("10")); // false  => 숫자임
// console.log(isNaN("blue")); // true  => 숫자가 아님
// console.log(isNaN(true)); // false  => 숫자임(false == 0 , true => 0이 아닌 모든 정수)

// == , ===
console.log(1 == "1");
console.log(1 === "1");

// 입력 대화창 팝업
// id = prompt("아이디를 입력해주세요");
// if (id == "fola") {
//   alert("아이디가 일치합니다");
// } else {
//   alert("아이디가 일치하지 않습니다");
// }

//
if ("") {
  console.log("empty string 1");
}
if (!"") {
  console.log("empty string 2");
}

//
let a;
if (a) {
  console.log("값이 할당되지 않는 변수 1");
}
if (!a) {
  console.log("값이 할당되지 않는 변수 2");
}

//
if (null) {
  console.log("null");
}
if (!null) {
  console.log("null");
}

//
if (NaN) {
  console.log("Nan 1");
}
if (!NaN) {
  console.log("Nan 2");
}

if (0 / 0) {
  console.log("0/0 1");
}
if (!(0 / 0)) {
  console.log("0/0 2");
}
