import java.util.Scanner;

public class User {
    private String userName;
    private int password;
    private String email;

    // Encapsulation: setters and getters
    public void setName(String s) {
        userName = s;
    }

    public String getName() {
        return userName;
    }

    public void setPassword(int pwd) {
        password = pwd;
    }

    // Method to update password after verifying old password
    public void updatePassword(int oldPwd, int newPwd) {
        if (oldPwd == password) {
            password = newPwd;
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("Old password does not match.");
        }
    }

    // ⚠️ Avoid direct password getter in real-life apps
    public boolean verifyPassword(int pwd) {
        return pwd == password;
    }

    public void setEmail(String em) {
        email = em;
    }

    public String getEmail(String uname, int pwd) {
        if (uname.equals(userName) && pwd == password) {
            return email;
        } else {
            System.out.println("Login details not matched. Re-enter credentials.");
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User obj = new User();
        obj.setName("Pavan Marikanti");
        obj.setPassword(8768);
        obj.setEmail("marikantipavankumar0@gmail.com");

        System.out.println("User Name: " + obj.getName());

        // Check login to get email
        

        System.out.println("Enter username:");
        String uname = sc.nextLine();
        System.out.println("Enter password:");
        int pwd = sc.nextInt();

        String email = obj.getEmail(uname, pwd);
        if (email != null) {
            System.out.println("User Email: " + email);
        }

        System.out.println("Enter the login Credentials to update the password");
        // Update password
        System.out.println("Enter old password to update:");
        int oldPwd = sc.nextInt();
        System.out.println("Enter new password:");
        int newPwd = sc.nextInt();

        obj.updatePassword(oldPwd, newPwd);

        sc.close();
    }
}
