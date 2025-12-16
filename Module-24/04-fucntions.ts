function calculate(title: string, price: number, quantity: number): string{
    return title +"total cost is "+ (price * quantity)
}

console.log(calculate("IPhone 15", 34343, 2));

const sum = (num1: number, num2: number): number => num1 + num2;

console.log("Result: " + sum(10, 20))