let marks: number[];
marks = [12, 3, 4, 5, 56, 66];
console.log(marks)

marks = [56, 66, 77]
console.log(marks)

const names: string[] = ["John", "Smith", "Bob"]
names.push("Ana")

// names =["John"]; // not possible, since names is const

console.log(names)

const friends: readonly string[] = ["Peter", "Bob"];
// friends.push("John") // not possible, since friends array is readonly
console.log(friends)