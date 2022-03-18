console.log(0);

// document.querySelector("btn_1").addEventListener("click", console.log("clicked"))
const btn_1 = document.getElementById("btn_1");

// btn_1.addEventListener('click', function () {
//     console.log(2)
// });


btn_1.addEventListener('click', do_1);


function do_1() {
    console.log(3);
}