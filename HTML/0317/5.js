console.log(1);

function display_info(args) {
  let output = "";

  if (typeof args.name == "string") {
    output += "Name : " + args.name + "\n";
  }

  if (typeof args.age == "number") {
    output += "Age : " + args.age + "\n";
  }
  console.log(output);
}

display_info({
  name: "Nicholas",
  age: 29,
});

display_info({
  name: "greg",
});
