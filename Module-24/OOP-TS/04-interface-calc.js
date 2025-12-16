var SimpleCalculator = /** @class */ (function () {
    function SimpleCalculator() {
    }
    SimpleCalculator.prototype.add = function (num1, num2) {
        return num1 + num2;
    };
    SimpleCalculator.prototype.sub = function (num1, num2) {
        return num1 - num2;
    };
    SimpleCalculator.prototype.mul = function (num1, num2) {
        return num1 * num2;
    };
    return SimpleCalculator;
}());
var calc = new SimpleCalculator();
console.log("Sum Result: " + calc.add(100, 20));
console.log("Subtraction Result: " + calc.sub(100, 20));
console.log("Multiplication Result: " + calc.mul(100, 20));
