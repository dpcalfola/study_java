console.log(1);

const person_1 = new Object();
person_1.name = "Simon";
person_1.age = 29;

const person_2 = {
  name: "Nicholas",
  age: 30,
};

const person_3 = {}; // Same as 'new Object()'
person_3.name = "Paul";
person_3.age = 31;

document.write(person_1.name + " : " + person_1.age + "<br>");
document.write(person_2.name + " : " + person_2.age + "<br>");
document.write(person_3.name + " : " + person_3.age + "<br>");
