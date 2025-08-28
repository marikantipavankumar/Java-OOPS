abstract  class Employee{
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee{
    @Override
    void calculateSalary(){
        int amount = 100000;
        System.out.println("Amount of the full time employee is fixed, that is :"+amount);
    }
}

class PartTimeEmployee extends Employee{
    @Override
    void calculateSalary(){
        int  hours = 10;
        int pay = 9000;
        int salary = hours * pay;

        System.out.println("Salary of the part time Employee is not fixed..."+salary);
    }
}
public class SalaryEx {
    public static void main(String[] args) {
        Employee e;
        e = new FullTimeEmployee();
        e.calculateSalary();

        e = new PartTimeEmployee();
        e.calculateSalary();
    }
}
