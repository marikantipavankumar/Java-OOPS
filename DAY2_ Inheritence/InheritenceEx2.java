class Vehicle{

    void speed(){
        System.out.println("The vehicle is moving at the speed of 90 km/h");
    }

    void brand(){
        System.out.println("The vehicle  Brand is Ashok Leyland");
    }
}
 class Car extends Vehicle{



void fuelType(){
    System.out.println("Fuel type of the given car is: CNG");
}

}


public class InheritenceEx2 {
    public static void main(String[] args) {
        
   
   Car c = new Car();

  c.fuelType();

    }

 
}
