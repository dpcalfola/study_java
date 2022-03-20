console.log(1);

let expression = "";

function add(character) {
  expression = expression + character;
  document.getElementById("display").value = expression;
}

function compute() {
  document.getElementById("display").value = eval(expression);
}

function clear_display() {
  document.getElementById("display").value = 0;
}

const btn_obj = document.getElementsByClassName("btn_1");
const display = document.getElementById("display");
