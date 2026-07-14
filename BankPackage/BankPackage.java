package BankPackage;  // "package" keyword is used to group related classes together

class Account {
    // Public: Accessible from anywhere
    public String name;
    // Protected: Accessible within the same package or by subclasses
    protected String email;
    // Private: Accessible only within this class
    private String password;

    // Setter method: Used to give a value to the private variable
    public void setPassword(String pass){
        this.password = pass;
    }

    // Getter method: Used to retrieve the value of the private variable
    public String getpassword() {
        return password;
    }
}

public class BankPackage {
    public static void main(String[] args) {
        // Creating an object of the Account class
        Account account1 = new Account();
        
        // Setting values directly for public and protected members
        account1.name = "ARPIT DHIMAN";
        account1.email = "arpitdhiman@gmail.com";
        
        // Using the setter method to set the private password
        account1.setPassword("abcd0");

        // Printing all details
        System.out.println("    Account Details    ");
        System.out.println("Name : " + account1.name);
        System.out.println("Email : " + account1.email);
        
        // Using the getter method to print the password
        System.out.println("Your password is set : " + account1.getpassword());
    }
}