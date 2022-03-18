// console.log(1);

let obj_1 = new Object();
const obj_2 = obj_1;
obj_1.name = "Fola";
console.log(obj_2.name);

function add_ten(num) {
  num += 10;
  return num;
}

const count = 20;
const result = add_ten(count);
console.log(count);
console.log(result);

function set_name(obj) {
  obj.name = "Person Name 1";
}
const person = new Object();
set_name(person);

console.log(person.name);

function set_name_2(obj) {
  obj.name = "Person Name 2";
  obj = new Object();
  obj.name = "Person Name 3";
}

const Person_o = new Object();
set_name_2(Person_o);
console.log(Person_o.name);

const person_a = new Object();
const person_b = "Steph";
console.log(person_a instanceof Object);
console.log(person_b instanceof Object);
//instanceof => person_a 가 Object 인지 true/false

console.log(typeof person_a);
console.log(typeof person_b);
