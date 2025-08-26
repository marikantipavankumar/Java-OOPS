abstract class BankAccount{
    int balance;
    BankAccount(int balance){
        this.balance = balance;
    }
    abstract void withdraw(int amount);

    void displayBalance(){
        System.out.println("Balance in your BankAccount is:"+balance);
    }
}
class SavingsAccount extends BankAccount{
    int minBalance = 1000;
    SavingsAccount(int balance){
        super(balance);
    }
    @Override
    void withdraw(int amount){
        balance = balance-amount;
        System.out.println("withdrawn :"+amount + "from Current Account");
    }
}

class CurrentAccount extends BankAccount{

    CurrentAccount(int balance){
        super(balance);
    }

    @Override
    void withdraw(int amount){
        balance = balance-amount;
        System.out.println("withdrawn "+amount+"from current Account");
    }
}

public class BankAccountEx {
    public static void main(String[] args) {
    SavingsAccount sa = new SavingsAccount(10000);
    sa.withdraw(9000);
    CurrentAccount ex = new CurrentAccount(23999);
    ex.withdraw(7448);
    
}

}