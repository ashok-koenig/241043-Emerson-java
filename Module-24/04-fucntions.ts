function calculate(title: string, price: number, quantity: number): string{
    return title +"total cost is "+ (price * quantity)
}

console.log(calculate("IPhone 15", 34343, 2));