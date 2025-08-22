class Human{
    private int age = 11;
    private String name = "Pavan";

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

}

public class Example1 {
    public static void main(String[] args){

        Human obj = new Human();
        System.out.println(obj.getName()+" :"+obj.getAge());
    }
}
