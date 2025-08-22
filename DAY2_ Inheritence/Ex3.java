class Person{
    String name = "Pavan Marikanti";
    int age = 21;
}

class  Emploee extends  Person{
    int salary = 82839;
}

public class Ex3{
    public static void main(String[] args) {
        Emploee e = new Emploee();
        System.out.println(e.salary);
        System.out.println(e.name);
        System.out.println(e.age);
    }
}
