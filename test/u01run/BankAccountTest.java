package u01run;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    private BankAccountWithFee bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccountWithFee();
    }

    @Test
    public void testIniziallyEmpty(){
        assertEquals(0, bankAccount.balance());
    }

    @Test
    public void testCanDeposit(){
        BankAccount bankAccount = new BankAccount();
        this.bankAccount.deposit(100);
        assertEquals(100, this.bankAccount.balance());
    }

    @Test
    public void testNegativeDeposit(){
        assertThrows(IllegalArgumentException.class, ()->this.bankAccount.deposit(-100));
    }

    @Test
    public void testCanWithdraw(){
        int depositedAmount = 100;
        int withdrawnAmount = 80;
        this.bankAccount.deposit(depositedAmount);
        this.bankAccount.withdraw(withdrawnAmount);
        assertEquals(depositedAmount - withdrawnAmount,this.bankAccount.balance());
    }

    @Test
    public void testNegativeWithdraw(){
        assertThrows(IllegalArgumentException.class, ()->this.bankAccount.withdraw(-100));
    }
}
