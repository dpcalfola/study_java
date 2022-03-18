const false_object = new Boolean(false);
const false_value = false;

result = false_object && true; // object 는 무조건 true (객체 자체는 true)
console.log(result);

console.log(typeof false_object);
console.log(typeof false_value);

console.log(false_object instanceof Boolean);
// true // Boolean 인스턴스냐? -> 맞음

console.log(false_value instanceof Boolean);
// false // Boolean 인스턴스냐? -> 아님. 인스턴스가 아님 value 임
