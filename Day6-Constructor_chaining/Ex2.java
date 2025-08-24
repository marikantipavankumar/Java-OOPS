class Student{

    public Student(int id) {
        System.out.println("id is:"+id);
    }

    Student(int id,String Name){
        this(id);
// to call the constructor of the same class from another constructor use this(...) ,within paranthesis you need to provide the parameters
        
        System.out.println("Name is:"+Name+" id is:"+id);;
    }
    
}


public class Ex2 {
    public static void main(String[] args) {
        Student c = new Student(938);
        Student cb = new Student(983,"Pavan");
    }
}
