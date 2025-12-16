interface Calculator{
    add(num1: number, num2: number): number; 
    sub(num1: number, num2: number): number; 
    mul(num1: number, num2: number): number; 
}

class SimpleCalculator implements Calculator{
    add(num1: number, num2: number): number {
        return num1 + num2
    }
    sub(num1: number, num2: number): number {
        return num1 - num2
    }
    mul(num1: number, num2: number): number {
        return num1 * num2
    }    
}

const calc = new SimpleCalculator()
console.log("Sum Result: "+ calc.add(100, 20))
console.log("Subtraction Result: "+ calc.sub(100, 20))
console.log("Multiplication Result: "+ calc.mul(100, 20))