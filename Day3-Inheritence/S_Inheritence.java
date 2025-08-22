class Vehicle{
    int v_speed = 90;

    void speed(){
        System.out.println("Speed of the vehicle is limited to the :"+v_speed);
    }
}

class Bike extends  Vehicle{
    int b_speed = 80;
    void  b_speed(){
        System.out.println("Speed of the bike is limited to the :"+b_speed);
        super.speed(); // super can be used only inside the  constructor,or method of the child class. wont use it directly in the class
    }
    
}
public class S_Inheritence {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.b_speed();

        Vehicle c = new Vehicle();
        c.speed();
    }
}



