class Person{
    Person(){
        System.out.println("Person from the Parent class");
    }
}

class Employee extends Person{
    Employee(){
        //super()  the child class constructor by default calls the parent class constructor first before executing its body
        System.out.println("Child from the sub class");
    }
}

public class Ex1 {
    public static void main(String[] args){

        Employee e = new Employee();
        
    }
}
