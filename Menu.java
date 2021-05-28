import java.util.*;
import java.lang.*;
public class Menu
{
    private String phone;
    private String name;
    public Menu(){}
    public void start(Admin a1, Organization o1, Menu m1)
    {
        System.out.println("Please enter your phone number: ");
        Scanner scanner = new Scanner(System.in);
        phone = scanner.nextLine();
        String yesORno;
        if (phone == a1.getphone())
        {
            System.out.println("This user is the Admin of the Organization " + o1.getOrgName() + "." );
        }
        else if (o1.isBeneficiary(phone) != -1)
        {
            o1.isBeneficiary(phone);
        }
        else if (o1.isDonator(phone) != -1)
        {
            o1.isDonator(phone);
        }
        else 
        {
            System.out.println ("This user is not yet registered to our system.");
            System.out.println ("Please enter yes to continue with your sign up , or no exit the program.");
            yesORno = scanner.nextLine();
            if (yesORno == "yes")
            {
                m1.SignUp(o1);
            }
            else if (yesORno == "no")
            {
                System.exit(0);
            }
        }
    }
    
    public void SignUp(Organization o1)
    {
        String select;
        int id = 1;
        int id2 = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input your Name: ");
        name = scanner.nextLine();
        System.out.println("Please Input your Phone Number: ");
        phone = scanner.nextLine();
        System.out.println("Type 1 If you want to create a Donator Account or Type 2 If you want to create a Beneficiary Account");
        select = scanner.nextLine();
        if(select == "1")
        {
            Donator d2 = new Donator((id++), name, phone); /*Να βρω έναν τρόπο ωστέ το όνομα του αντικειμένου πχ d2 να αλλάζει 
            κάθε φορά που τρέχει αυτό το κομμάτι κώδικα*/
            o1.insertDonator(d2); /*Και εδώ το ίδιο*/
        }
        else if(select == "2")
        {
            Beneficiary b3 = new Beneficiary((id2++), name, phone);/*Να βρω έναν τρόπο ωστέ το όνομα του αντικειμένου πχ d2 να αλλάζει 
            κάθε φορά που τρέχει αυτό το κομμάτι κώδικα*/
            o1.insertBeneficiary(b3); /*Και εδώ το ίδιο*/
        }
        else{
            //Εδώ θέλουμε ένα exception κατά την γνώμη μου που θα κάνει exit το πρόγραμμα
        }
        System.out.print("Welcome User with Username: " + name + "Phone number " + phone + "You belong in the Organization " + o1.getOrgName() 
        + "You are a "); 
        if(select == "1"){ System.out.println("Donator.");}
        else {System.out.println("Beneficiary.");}
    }
}
