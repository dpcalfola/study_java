const person_1 = {
  toLocaleString: function () {
    return "Nikolas";
  },

  toString: function () {
    return "Nucholas";
  },
};

const person_2 = {
  toLocaleString: function () {
    return "Grigorios";
  },
  toString: function () {
    return "Greg";
  },
};

const people = [person_1, person_2];

// alert(people);
// alert(people.toString());
// alert(people.toLocaleString());

console.log(people);
console.log(people.toString());
console.log(people.toLocaleString());

const false_object = new Boolean(false);
let result = false_object && true;
console.log(result); // true
console.log(typeof false_object); // object
console.log("Greg" && true); // true
console.log("console.log(Object) 아래");
console.log(Object);
document.write(result + " ");

const false_value = false;
result = false_value && true; // false
console.log(result);
