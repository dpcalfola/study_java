// console.log(1);

// 의문점
// var => 동작함
// const 또는 let => 동작하지 않음

const color_1 = "green";
var color_2 = "blue";

function get_coler() {
  var color = "red";
  return color;
}

document.write("get_color() : " + get_coler() + "<br>");
document.write("window.color : " + window.color_2);
