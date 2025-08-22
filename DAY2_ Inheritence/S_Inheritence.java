
class Animal{
    void eat(){
        System.out.println(" Animal eats both veg and non-veg");
    }
}

class Dog extends  Animal{
    void bark(){
        System.out.println("dog is barking:");
    }
}

public class S_Inheritence {
    public static void main(String[] args){

        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
