console.log("t");

const div_object_1 = document.getElementById("div_1");
const div_object_2 = document.getElementById("div_2");

function on_mouse_in() {}

function on_button_down(button) {
  button.style.color = "#ff0000";
}
function on_button_up(button) {
  button.style.color = "#009500";
}

div_object_2.style.backgroundColor = "yellow";
div_object_2.style.width = "200px";
div_object_2.onmouseover = on_mouse_in();
