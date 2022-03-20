const button_1 = document.getElementById("button_1");

button_1.addEventListener("click", function () {
    const exp = /^[0-9]+$/;
    const phone_num = document.getElementById("phone");
    const msg = document.getElementById("msg");

    if (phone_num.value.match(exp)) {
        console.log(phone_num.value);
        msg.innerHTML = phone_num.value;
    } else {
        console.log("wrong number");
        msg.innerHTML = "숫자만 입력하세요";
    }
});
