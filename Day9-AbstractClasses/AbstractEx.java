
abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog is making the  bark sound");
    }
}

class Cat extends  Animal{
    @Override
    void sound(){
        System.out.println("Cat is making the meow sound:");
    }
}

class Cow extends Animal{
    @Override
    void sound(){
        System.out.println("Cow is making the Sound");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        Animal a ;
        a = new Cat();
        a.sound();
        a = new Dog();
        a.sound();

        a = new Cow();
        a.sound();
    }
}
