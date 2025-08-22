class Vehicle2{
    Vehicle2(){
        System.out.println("This is the parent class:");

    }
}

class Car extends Vehicle2{
   Car(){
        System.out.println("this is the first class to extend:");
    }
}

class Van extends Car{
    
    Van(){
        System.out.println("Van is extending the car:");
    }
}


class Aero extends Van{

    Aero(){
        System.out.println("Aero is extending the Van");
    }

}

public class Multilevel_Inheritence {
    public static void main(String[] args) {
       Aero a = new Aero();
       


    }
}
