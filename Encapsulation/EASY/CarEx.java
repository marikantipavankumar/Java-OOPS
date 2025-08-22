public class CarEx {

   private  int speed;

   public void setSpeed(int s){
            if(s>0 && s<180){
                speed = s;
            }
            else{
                System.out.println("Can't assign the speed .. as it is out of limits");
            }
   }

   public int getSpeed(){
    System.out.println("The Speed is:");
    return  speed;
   }
    public static void main(String[] args) {
        CarEx obj = new CarEx();
        obj.setSpeed(20);
        System.out.println(obj.getSpeed());

        obj.setSpeed(0);
        System.out.println(obj.getSpeed());
    }
}
