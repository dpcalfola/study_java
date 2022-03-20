confirm_btn.addEventListener("click", confirm_btn_clicked);

function confirm_btn_clicked() {
  //   message_string = "";
  //   if (name_value == "") {
  //     message_string += "이름이 비어있습니다. ";
  //   }
  //   if (birth_value == "") {
  //     message_string += "생년월일이 비어있습니다. ";
  //   }
  const confirm_btn = document.getElementById("confirm_btn");
  const birth_value = document.getElementById("tbirth");
  const message_span = document.getElementById("message");
  const name_1 = document.getElementById("tname").value;
  message_span.innerHTML = name_1;
  console.log(name_1);
  console.log(document.getElementById("confirm_btn").value);
}
