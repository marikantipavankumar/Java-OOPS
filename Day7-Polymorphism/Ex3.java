class Animal{
    void makeSound(){
        System.out.println("Animal is making sound:");

    }
}
class Cat extends Animal{
    @Override

    void makeSound(){
        System.out.println("Cat is making the sound:");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog is making the sound");
    }
}
public class Ex3 {
    public static void main(String[] args){

        Animal a = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        a.makeSound();
        myCat.makeSound();
        myDog.makeSound();
    }
}
