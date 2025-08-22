import practice.Dog;

class Animal{
    void sound(){
        System.out.println("Animal is  making SOund:");
    }
}


class Dog extends Animal{
    void  sound(){
        System.out.println("Dog is Barking");
    }
} 

class Cat extends  Animal{
    void sound(){
        System.out.println("Cat is making meow sound");
    }
}

class hen extends Animal{
    void sound(){
        System.out.print("Hen is making the sound");
    }
}


public class Inheritence {
    public static void main(String[] args) {    
    Animal a;
    a= new Dog();
    a.sound();

    a = new Cat();
    a.sound();

    a =  new hen();
    a.sound();

}
}