// console.log(1);

const age_1 = 20;
const age_as_string_1 = age_1.toString();
const age_as_binary = age_1.toString(2);
console.log(age_1);
console.log(age_as_string_1);
console.log(age_as_binary);

const found_1 = true;
const found_1_as_string_1 = found_1.toString();
console.log(found_1);
console.log(found_1_as_string_1);

let person_o = new Object();
person_o.name = "Fola o";
console.log(person_o.name); // Fola o

let person_v = "Fola v";
person_v.age = 60;
console.log(person_v.age); //undefined
