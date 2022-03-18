// console.log(1);

function say_hi() {
  console.log("arguments.length => " + arguments.length);
  if (arguments.length == 1) {
    console.log("arguments[0] => " + arguments[0]);
  } else if (arguments.length == 2) {
    console.log(
      'arguments[0] + " : " + arguments[1] => ' +
        arguments[0] +
        " : " +
        arguments[1]
    );
  }
}
console.log(1);
say_hi();

console.log(2);
say_hi("Fola");

console.log(3);
say_hi("Fola", "Flor");

console.log("''");
