
abstract class BankAccount{
    abstract void calculateInterest();
}

class SavingsAccount extends  BankAccount{
    @Override
    void calculateInterest(){
        System.out.println("This is a savings Account .. since here the interest is very low");
    }
}

class CurrentAccount extends BankAccount{
    @Override
    void calculateInterest(){
        System.out.println("This is a Current Account .. since here the interest is High compared to savings Account");
    }
}
public class BankAccountEx {
    public static void main(String[] args) {
        BankAccount ex;
        ex = new SavingsAccount();
        ex.calculateInterest();

        ex = new CurrentAccount();
        ex.calculateInterest();
    }
}
