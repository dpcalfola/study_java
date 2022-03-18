function process() {
  const obj_1 = document.getElementById("input_form_target");
  console.log(obj_1.value);
}

function get_div_attribute() {
  const value_1 = document.getElementById("div_1").innerHTML;
  console.log(value_1);
  //   alert(value_1);
}

function set_div_attribute(input_value) {
  document.getElementById("div_1").innerHTML = input_value;
}

// function change_image() {
//   const image_obj_1 = document.getElementById("image_1");
//   if (image_obj_1.getAttribute("src") == "./../src/image1.jpg") {
//     image_obj_1.src = "./../src/image2.jpg";
//   } else {
//     image_obj_1.src = "./../src/image1.jpg";
//   }
// }

// function toggle_image() {
//   const image_obj_1 = document.getElementById("image_1");
//   image_obj_1.toggleAttribute();
// }

// const change_image_button = document.querySelector("#button_change_image");
// change_image_button.addEventListener("click", console.log(3));
