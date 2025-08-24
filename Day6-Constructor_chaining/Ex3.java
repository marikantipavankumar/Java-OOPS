class Vehicle{
    String brand;
    int year;

    public Vehicle(String brand,int year) {
        this.brand = brand;
        this.year = year;

        System.out.println("Vehicle brand is:"+brand +" and Manufacture year is:"+year);
    }  
}
class Car extends Vehicle{
    String model;
    Car(String brand,int year,String model){
        super(brand,year);
        System.out.println("Vehicle Model is :"+model);
    }
}



public class Ex3 {
    public static void main(String[] args) {
        
        Car c  = new Car("Toyota", 8392,"new");
    }
}

