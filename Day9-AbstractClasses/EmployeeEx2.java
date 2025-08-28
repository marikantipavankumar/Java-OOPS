abstract  class Employee{
    String name;
    int id;

    Employee(String name,int id){
        this.id = id;
        this.name = name;
    }
    void displayDetails(){
        System.out.println("Employee name is:"+name+" and id is:"+id);
    }
    
    abstract void calculateSalary();
}

class FullTimeEmployee2 extends Employee{
    int salary;

    FullTimeEmployee2(String name,int id,int salary) {
        super(name,id);
        this.salary = salary;
    }
    void calculateSalary(){
        System.out.println("Full time Employee Salary is:"+salary);
    }    
}

class PartTimeEmployee2 extends Employee{
    int salary;

    public PartTimeEmployee2(String name,int id,int salary) {
        super(name,id);
        this.salary = salary;
    }
    void calculateSalary(){
        System.out.println("Part time Employee Salary is:"+salary);
    }
    
}

public class EmployeeEx2 {
    public static void main(String[] args) {
     Employee e ;
     e = new  FullTimeEmployee2("pavan",928,827292);
     e.displayDetails();
     e.calculateSalary();

     e = new PartTimeEmployee2("Uday",828,92837);
     e.calculateSalary();
    }
}
