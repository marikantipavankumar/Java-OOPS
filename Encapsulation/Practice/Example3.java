class Student{

     private int rno;
     private String name;
     private boolean isAttended;

     public void setAttendence(boolean flag){
        if(isAttended != flag){
            System.out.println("setting the Attendance value by using the setAttendance method");
            isAttended = flag;
        }
      }
     public boolean getAttendence(){
        System.out.println("Printing the Attendance variable value :");

        return isAttended;
     }

     public void setRno(int r){

        rno =r;

     }

     public int getRno(){
        return rno;
     }



}


public class Example3 {
    public static void main(String[] args) {
        
        Student obj = new Student();
        obj.setAttendence(true);

        obj.setRno(10);
        System.out.println(obj.getRno()+":"+obj.getAttendence());
    }




}


 