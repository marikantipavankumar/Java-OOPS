public class BankEx{

    private int acNO;
    private int balance;

    public void setAcNo(int no){
        acNO = no;
    }

    public void setBalance(int n){
        balance = n;
    }

    public int getAcNo(){
        System.out.println("Account Number is:");
        return acNO;
    }

    public int getBalance(){
        if(balance>=0){
            return balance;
        }
        else{

            System.out.println("Sorry you have minus balance");
        return -1;
        }
    }
    public static void main(String[] args){
        BankEx  obj = new BankEx();

        obj.setAcNo(984047430);
        obj.setBalance(-1);
        System.out.println(obj.getAcNo());
        System.out.println("Available balance is:" +obj.getBalance());

    }
}