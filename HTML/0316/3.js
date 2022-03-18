// console.log(1);

function numbering() {
  i = 0;
  while (i < 10) {
    document.write(i);
    i++;
  }
}

numbering();

document.write("<br>");

//
function get_arguments(arg1, arg2) {
  return arg1 + arg2;
}

console.log(get_arguments(1, 2));

(function () {
  i = 0;
  while (i < 10) {
    document.write("anonymous funtion : " + i + "<br>");
    i++;
  }
})();
document.write("<br>");

function func_plus(arg1, arg2) {
  return arg1 + arg2;
}

const v1 = func_plus(5, 7);
console.log(v1);

//
function say_hi(name, message) {
  return;
}
console.log(say_hi("Fola", "hi")); // undefined
