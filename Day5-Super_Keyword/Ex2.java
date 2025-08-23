
class GrandParent{
    void greet(){
        System.out.println("Hello from the GrandParent");
    }
}

class  Parent extends  GrandParent{
    void greet(){
        System.out.println("Hello from the parent");
        super.greet();
    }
}

class Child extends Parent{
    void greet(){
        System.out.println("Hello from the child");
        super.greet();
    }
}
public class Ex2 {
    public static void main(String[] args) {
       Child c = new Child();
       c.greet(); 
    }
}

