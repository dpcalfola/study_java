console.log(3);

const colors_3 = ["red", "blue", "green"];
colors_3.length = 4;
console.log(colors_3[3]); // undefined
console.log(colors_3); // ['red', 'blue', 'green', empty]

const colors_4 = ["red", "blue", "green"];
colors_4[colors_4.length] = "black";
colors_4[colors_4.length] = "yellow";

console.log(colors_4);
