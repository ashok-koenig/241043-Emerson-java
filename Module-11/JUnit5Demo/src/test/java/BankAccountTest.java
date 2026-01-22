import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    BankAccount account;

    @BeforeEach
    void init(){
        account = new BankAccount("John", 1000);
    }

    @Test
    void testWithdraw(){
        account.withdraw(200);
        Assertions.assertEquals(800, account.getBalance());
    }

    @Test
    void testDeposit(){
        account.deposit(500);
        Assertions.assertEquals(1500, account.getBalance());
    }
}
