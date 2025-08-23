
class Vehicle{

    int max_speed = 90;
}

class Car extends  Vehicle{
    void speed(){
        System.out.println("Maximum speed of the car is :"+super.max_speed);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.speed();
    }
}
