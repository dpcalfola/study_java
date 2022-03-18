function change_style() {
  button_obj = document.getElementById("p1").style;

  button_obj.color = "red";
  button_obj.fontStyle = "italic";
}

const btn_1 = document.getElementById("button_1");

function do_1() {
  console.log("function do_1");
}

function hide() {
  document.getElementById("p1").style.visibility = "hidden";
}

btn_1.addEventListener("click", do_1);
btn_1.addEventListener("click", hide);

// const open_google_btn = document.getElementById("button_open_google");
// open_google_btn.addEventListener("click", open_google());
