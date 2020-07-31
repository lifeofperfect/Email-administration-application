package emailPackage;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int defaultPassword = 10;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String email;
    private String companyName="comapny.com";

    //recieve first name and password
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //System.out.println(firstName + " "+lastName);

        //set module for department choice
        this.department = setDocument();
        //System.out.println(this.department);

        //set module for random pasword
        this.password = setRandomPassword(defaultPassword);
        System.out.println("password: "+this.password);

        //set email
        this.email = this.firstName+"."+this.lastName+"@"+this.department+"."+this.companyName;
        //System.out.print("Email: "+this.email);
    }


    //ask for department
    private String setDocument() {
        System.out.println("Enter department\n1 sales\n2 Development\n3 Accountant\n0 None");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice==1) {
            return "Sales";
        }else if(depChoice==2) {
            return "Dev";
        }else if(depChoice==3) {
            return "Accountant";
        }else {
            return " ";
        }
    }
    //generate random password
    private String setRandomPassword(int length) {
        String passwordChar = "1234567890ABCDEFGHIJKLMNOPQRESTUVWXYZabcdefghijklnmopqrstuvwxyz!£$%^&*~@#";
        char[] password = new char[length];
        for(int i=0; i<length; i++) {
            int rand = (int)(Math.random()* passwordChar.length());
            password[i] = passwordChar.charAt(rand);
        }
        return new String(password);
    }

    //set email capacity
    public void setEmailCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    //set alternative email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    //change password
    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlternateEmail() {return alternateEmail;}
    public int getEmailCapacity(){return mailBoxCapacity;}
    public String getPassword() {return password;}

    public String showInfo() {
        return "User: "+firstName+" "+lastName+"\nCompany Email: "+email+"\nMailBox capacity: "+ mailBoxCapacity;
    }
}
