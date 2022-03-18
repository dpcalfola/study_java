// const year = 1980;
// alert("응답하라" + year);

let my_name;
my_name = "Fola ";

let age;
age = 30;

// 줄바꿈 어케하는지? -> ㅋㅋ
document.write("<br>");

// document.write("\n" + my_name + "\n" + age);
document.write(my_name + age + "<br>");

// 사칙연산
const num_a = 10;
const num_b = 20;
const num_c = 0.3;
const num_d = 0.2;
document.write("<br>");

// 아님;; 백틱 사용시 변수가 다 문자열 취급?
// test1: 결과 => 10 + 20 =1020
document.write("test1 <br>");
document.write(`${num_a} + ${num_b} =` + num_a + num_b + "<br>");
document.write("<br>");

// test2: 결과 => 10 + 20 = 30
document.write("test2 <br>");
document.write(`${num_a} + ${num_b} = ${num_a + num_b}` + "<br>");
document.write("<br>");

// test3: 그렇다면..
document.write("test3 <br>");
document.write(
  `` + num_a + " + " + num_b + " = " + `${num_a + num_b}` + "<br>"
);
document.write(num_a + " + " + num_b + " = " + `${num_a + num_b}` + "<br>");
document.write("<br>");

// etc
document.write("ect <br>");
document.write(num_a - num_b + "<br>");
document.write(num_c * num_d + "<br>");
document.write(num_c / num_d + "<br>");
document.write("<br>");

// 문자열
my_name = "Fola";
const my_address = "Namyangju";
const is_single = false;
const is_male = true;
document.write("Name : " + my_name + "<br>" + "Address : ");
document.write("Is single : " + is_single + "<br>");
document.write("Is male? : " + is_male + "<br>");
document.write("<br>");

// 문자형 숫자형
let v = null;
document.write("문자형 : " + v + "<br>");
document.write(`숫자형 : ${v + 3}<br>`);
document.write("<br>");

const num_a_for_if = 5;
const num_b_for_if = 3;

if (num_a_for_if > 0) {
  document.write(`${num_a_for_if} 는 0 보다 크다` + "<br>");
} else {
  document.write(`${num_a_for_if} 는 0 보다 작다` + "<br>");
}

if (num_a_for_if > num_b_for_if) {
  document.write("a는 b보다 크다" + "<br>");
} else {
  document.write("a는 b보다 작다" + "<br>");
}
document.write("<br>");

// switch case
const shortcut = 1;
document.write("switch case" + "<br>");
switch (shortcut) {
  case 1:
    document.write("1");
    break;
  case 2:
    document.write("2");
    break;
  default:
    document.write("default");
    break;
}
document.write("<br>");
document.write("<br>");

// while loop
document.write("--- while loop start --- <br>");
let i = 0;
while (i < 5) {
  document.write(i++ + " javascript while loop" + "<br>");
}
document.write("--- while loop end --- <br>");
document.write("<br>");

// for loop
document.write("--- for loop start --- <br>");
for (let i = 0; i < 5; i++) {
  document.write(i + " javascript for loop + <br>");
}
document.write("--- for loop end --- <br>");
document.write("<br>");

// function
document.write("--- function start --- <br>");

function my_info(intput_my_name, input_age) {
  document.write("이름 : " + intput_my_name + "<br>");
  document.write("나이 : " + input_age + "<br>");
}

my_info(my_name, age);

document.write("--- function end --- <br>");
document.write("<br>");
