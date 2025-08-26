
class Example{
    void run(){
        System.out.println("This is an Parent class");
    }
}

class Example2 extends Example{
void run(){
    System.out.println("This is the child class :");
}
}

public class Ex2 {
    public static void main(String[] args){
        Example e ;
        e=new Example();    
        e.run();

        e = new Example2();
        e.run();

        
    }
}
