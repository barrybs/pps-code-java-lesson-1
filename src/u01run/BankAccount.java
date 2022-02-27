package u01run;

public class BankAccount {
    private static final int FEE = 1;
    private int balance = 0;

    public int balance() {
        return 0;
    }

    public void deposit(final int amount) {
        checkNegativeArgument(amount);
        this.balance = this.balance + amount;
    }

    public void withdraw(final int amount) {
        checkNegativeArgument(amount);
        this.balance = this.balance - amount - FEE;
    }

    private void checkNegativeArgument(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
    }
}
