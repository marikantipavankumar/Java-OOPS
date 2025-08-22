// assingning the  private variable values with setters and accessing them with the getters methods

class Human{
     private int age;
     private String name;


     public void  setAge(int a){
        age = a;
     }

     public void setName(String n){
        name = n;
     }

     public String getName(){
        return name;
     }  
     
     public int  getAge(){
        return age;
     }


    }

public class Example2 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(10);
        obj.setName("Pavan Marikanti");

        System.out.println(obj.getName()+" :"+obj.getAge());
    
    }
}
