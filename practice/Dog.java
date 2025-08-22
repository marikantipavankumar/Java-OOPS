import Dog;
package practice;
interface A{
    void show();
    void sleep();
}

class B implements  A{
    public void show(){
        System.out.println("in show");
    }

    public void sleep(){
        System.out.println("in sleep");
    }
}

public class Dog{
    public static void main(String[] args) {
        Dog d;
        d = new B();
        
    }
}