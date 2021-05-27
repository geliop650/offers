import java.util.*;
import java.lang.*;
public class Menu
{
    String phone;
    public Menu(){}
    public void start(Admin a1, Organization o1, Menu m1)
    {
        System.out.println("Please enter your phone number: ");
        Scanner scanner = new Scanner(System.in);
        phone = scanner.nextLine();
        String yesORno;
        if (phone == a1.getphone())
        {
            System.out.println("This user is the Admin of the Organization " + o1.getName() + "." );
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
                m1.SignUp();
            }
            else if (yesORno == "no")
            {
                System.exit(0);
            }
        }
    }
    
    public void SignUp()
    {
        
    }
}
