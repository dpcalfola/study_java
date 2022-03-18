console.log(1);

function add_some_number(num) {
  return num + 10;
}

function add_some_number(num) {
  return num + 30;
}

// 나중의 함수가 앞의 함수를 덮어씌운다
const result = add_some_number(400);
console.log(result);
