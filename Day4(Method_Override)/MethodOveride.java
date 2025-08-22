class Animal{
    void dog(){
        System.out.println("Dog is also a Animal:");
    }

    void bark(){
        System.out.println("Dog will bark:");
    }
}

class Child extends  Animal{
        void dog(){
        super.dog();
        System.out.println("this is a Dog method ");
    }

    
    void eat (){
        System.out.println("Child Dog is  too pretty");
    }
}

public class MethodOveride {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.dog();

    }
}
