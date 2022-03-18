console.log(1);

const colors1 = new Array();
const colors2 = new Array(5);
const colors3 = new Array("red", "blue", "green");
const colors4 = Array(3);

// 배열 리터럴 표기법
const colors5 = ["red", "blue", "green"];
const colors6 = []; // 빈 배열

console.log(colors5[0]);
colors5[3] = "brown";
// colors5[2] = "brown";
console.log(colors5.length);
console.log(colors5);

console.log("1: " + colors1);
console.log("2: " + colors2);
console.log("3: " + colors3);
console.log("4: " + colors4);
console.log("5: " + colors5);

console.log(colors1);
console.log(colors2);
console.log(colors3);
console.log(colors5);
console.log(colors4);
