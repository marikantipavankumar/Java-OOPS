class Computer{
    Computer(){
        System.out.println("We are in the Parent PC Constructor");
    }
}

class Laptop extends  Computer{

     Laptop() {
        System.out.println("This is a 1st child Constructor");
    }

    Laptop(int year){
        this();
        System.out.println("Laptop Manufacturer year is :"+year);
    }
    
}
public class Ex4 {
    public static void main(String[] args) {
        Laptop lp = new Laptop(940);
    }
}
