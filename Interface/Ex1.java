package Interface;

public class Ex1 {
    String name;
    int age;
    String breed;
    float price;

    public Ex1(String name,int age,String breed,float price) {
        this.age =age;
        this.name = name;
        this.breed = breed;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return  age;
    }
    public float getPrice(){
        return price;

    }

    public String getBreed(){
        return breed;
    }
    

    public static void  main(String[] args){
        Ex1 ex = new Ex1("german shephard",20, "helllo", 20.0f);
        System.out.println("Name: " + ex.getName());
        System.out.println("Age: " + ex.getAge());
        System.out.println("Breed: " + ex.getBreed());
        System.out.println("Price: " + ex.getPrice());
    }
}
