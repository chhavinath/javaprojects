package emailapp;

import java.security.PublicKey;
import java.util.Scanner;

public class Email
{
        private String Name;
        private String password;
        private String department;
        private int mailBoxCapacity = 500;
        private String email;
        private String alternateMail;
        private String companysuffix = "aeycompany.com";
    Scanner sc = new Scanner(System.in);

//        constructor
        public Email(String firstName,String lastName){
            this.Name= getfirstname();

//        ask for department
            this.department = getDepartment();
//      call a method to return password
            this.password = generatePassword(8);
            System.out.println("your password is \" " + this.password + " \"");
//      combine email address
        email = firstName.toLowerCase() +"." + lastName.toLowerCase() + "@" + department + companysuffix;
        }

    private String getfirstname()
    {
        String namef;
        System.out.println("ENTER YOUR NAME ::");
        namef = sc.nextLine();
        return namef;
    }

    //        ask for department
private String getDepartment()
{
    System.out.println("department codes \n 1 accounting\n 2 sales\n 3 development\n 0 for none\n enter your department code::");

    int deptchoice = sc.nextInt();
    switch (deptchoice)
    {
        case 1 :
            return "accounting";
        case 2:
            return "sales";
        case 3:
            return "development";
        default:
            return "";
    }
}

//        set random password
    private String generatePassword(int lengeth)
    {
        String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*abcdefghijklmnopqrstuvwxyz";
        char[] password = new char[lengeth];
        for (int i = 0; i < lengeth ; i++)
        {
            int rand = (int)(Math.random() * passwordset.length());
            password[i] = passwordset.charAt(rand);
        }
        return new String(password);
    }



//        set the mailbox capacity
    public void setMailBoxCapacity(int capacity)
    {
        this.mailBoxCapacity = capacity;
    }

//        set the alternate email
    public void setAlternateMail(String altmail)
    {
        this.alternateMail = altmail;
    }
//        change the password
    public void changepassword (String newpass)
    {
        this.password = newpass;
    }

    public String getEmail()
    {
        return email;
    }
    public String getAlternateMail()
    {
        return alternateMail;
    }
    public String getPassword()
    {
        return password;
    }
    public String display()
    {
        return "DISPLAY INFO :: " + Name +
                "\n DEPARTMENT:: " + department +
                "\nEMAIL ADDRESS:: " + email+
                "\n MAILBOXCAPACITY::" + mailBoxCapacity;
    }

}
