

class BankAccount{
    BankAccount(int balance){
        System.out.println("Balance is: "+balance);
    }
}

class SavingsAccount extends BankAccount{
    int balance;
    int Interest;
     SavingsAccount(int balance,int Interest) {
        super(balance);
        this.balance = balance;
        this.Interest = Interest;
         
         System.out.println("Interest is:"+Interest);

         
    }
    void newAmount(){
            int amount = balance + Interest;
            System.out.println("New Amount is:"+amount);
         }
    
}

public class Ex3 {
    public static void main(String[] args) {
        
        SavingsAccount sa = new SavingsAccount(100000,8483);
        sa.newAmount();
        
    }
}
