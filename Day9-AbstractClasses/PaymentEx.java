abstract class Payment{
    abstract void pay(double amount);
}

class CreditCard extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Amount in the Credid-Card Method is :"+amount);
    }
}

class UpiPayment extends  Payment{
    @Override
    void pay(double amount){
    System.out.println("Amount in the UpiPayment Methos is:"+amount);
}
}
public class PaymentEx{
    public static void main(String[] args){

        Payment p ;
          
        p = new CreditCard();
        p.pay(9404.8493);

        p= new UpiPayment();
        p.pay(949343.9403);

      
    }
}