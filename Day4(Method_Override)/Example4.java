class Parent{
    void getPayment(){
        System.out.println("Parent");
    }
}

class Child extends  Parent{
    @Override
    void getPayment() {
        System.out.println("Child");
    }
}
public class Example4 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.getPayment();

        Child c = new Child();
        c.getPayment();
    }
}
