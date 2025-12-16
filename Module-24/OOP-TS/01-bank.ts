// Class declaration
class Bank {
    // Instance members / variables / properties
    accountName: string;
    accountNumber: number;
    accountBalance: number;
    // constructor
    constructor(accountName: string, accountNumber: number, accountBalance: number){
        this.accountName = accountName
        this.accountNumber = accountNumber
        this.accountBalance = accountBalance
    }

    // Instance method/ function
    deposit(amount: number){
        if(amount>0){
            this.accountBalance += amount
            console.log("Amount deposited: "+ amount)
        }else{
            console.log("Invalid amount")
        }
    }

    checkBalance(){
        console.log("balance is "+ this.accountBalance)
    }
}

// Create object for the class bank
const obj = new Bank("John", 123, 1000)
obj.deposit(500)
obj.accountBalance = 1000000;
// console.log("Balance: "+ obj.accountBalance)
obj.checkBalance()