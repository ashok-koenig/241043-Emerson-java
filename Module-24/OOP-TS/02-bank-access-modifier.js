// Class declaration
var Bank = /** @class */ (function () {
    // constructor
    function Bank(accountName, accountNumber, accountBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    // Instance method/ function
    Bank.prototype.deposit = function (amount) {
        if (amount > 0) {
            this.accountBalance += amount;
            console.log("Amount deposited: " + amount);
        }
        else {
            console.log("Invalid amount");
        }
    };
    Bank.prototype.checkBalance = function () {
        console.log("balance is " + this.accountBalance);
    };
    return Bank;
}());
// Create object for the class bank
var obj = new Bank("John", 123, 1000);
obj.deposit(500);
// obj.accountBalance = 1000000; // not possible, since accountBalance is private
// console.log("Balance: "+ obj.accountBalance)
obj.checkBalance();
