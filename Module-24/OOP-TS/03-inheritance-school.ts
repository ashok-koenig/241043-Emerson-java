class Person {
//    private name: string;
//    private age: number;
//     constructor(name: string, age: number){
//         this.name = name;
//         this.age = age;
//     }
// shorthand syntax to declare a protected variable and initialize the same. 
    constructor(protected name: string, protected age: number){}

    protected introduce(){
        console.log(`I'm ${this.name} and ${this.age} years old`)
    }
}

class Student extends Person {
    constructor(name: string, age: number, private grade: number){
        super(name, age)
    }
    // overriding 
    public introduce(): void {
        super.introduce()
        console.log("Studing grade: "+ this.grade )
    }
}

const john = new Student("John", 15, 8)
john.introduce()