var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person = /** @class */ (function () {
    //    private name: string;
    //    private age: number;
    //     constructor(name: string, age: number){
    //         this.name = name;
    //         this.age = age;
    //     }
    // shorthand syntax to declare a protected variable and initialize the same. 
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    Person.prototype.introduce = function () {
        console.log("I'm ".concat(this.name, " and ").concat(this.age, " years old"));
    };
    return Person;
}());
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, grade) {
        var _this = _super.call(this, name, age) || this;
        _this.grade = grade;
        return _this;
    }
    // overriding 
    Student.prototype.introduce = function () {
        _super.prototype.introduce.call(this);
        console.log("Studing grade: " + this.grade);
    };
    return Student;
}(Person));
var john = new Student("John", 15, 8);
john.introduce();
