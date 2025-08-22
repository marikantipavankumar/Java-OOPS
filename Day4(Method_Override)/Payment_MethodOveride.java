class Payment{
    void processPayment(){
        System.out.println("Waiting a second processing the payment");
    }
}

class CreditCard extends  Payment{
    @Override
void processPayment(){
        System.out.println("Processing the Credit card payment process method");
    }
    
}

class DebitCard extends Payment{
    @Override
   void processPayment(){
        System.out.println("Processing the Debit card processing method");
    }
}

public class Payment_MethodOveride{
    public static void main(String[] args) {
        
       CreditCard cd = new CreditCard();
       cd.processPayment();

       DebitCard db = new DebitCard();
       db.processPayment();

    }
}