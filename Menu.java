import java.util.*;
import java.lang.*;
public class Menu
{
    private String phone;
    private String name;
    public Menu(){}

    public void start(Organization o1, Menu m1)
    {
        System.out.println("Please enter your phone number: "); //exception για το αν το τηλέφωνο είναι τηλέφωνο και όχι text
        Scanner scanner = new Scanner(System.in);
        phone = scanner.nextLine();
        String answer;
        Beneficiary t1 = o1.getBeneficiary(phone);
        Donator s1 = o1.getDonator(phone);

        if (phone == o1.getAdmin().getphone())
        {
            System.out.println("Welcome Admin! \n" 
                + "Username: " + o1.getAdmin().getName() + "\n"
                + "Phone number: " + o1.getAdmin().getPhone() + "\n"
                + "You belong in the Organization " + o1.getOrgName());
            //μέθοδο για συνέχεια
        }

        else if (t1 != null)
        {
            System.out.println("Welcome Beneficiary! \n" 
                + "Username: " + t1.getName() + "\n"
                + "Phone number: " + t1.getPhone() + "\n"
                + "You belong in the Organization " + o1.getOrgName());
            //μέθοδο για συνέχεια
        }
        else if (s1 != null)
        {
            System.out.println("Welcome Donator! \n" 
                + "Username: " + s1.getName() + "\n"
                + "Phone number: " + s1.getPhone() + "\n"
                + "You belong in the Organization " + o1.getOrgName());
            //μέθοδο για συνέχεια
        }
        else 
        {
            System.out.println ("This user is not yet registered in our system.");
            System.out.println ("Please enter yes to continue with your sign up, or no to exit the program.");
            answer = scanner.nextLine();
            if (answer == "yes")
            {
                m1.SignUp(o1);
            }
            else if (answer == "no")
            {
                System.exit(0);
                scanner.close();
            }
        }
        scanner.close();
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
            Donator d = new Donator((id++), name, phone);
            o1.insertDonator(d);
            System.out.println("Welcome Donator! \n" 
                + "Username: " + name + "\n"
                + "Phone number: " + phone + "\n"
                + "You belong in the Organization " + o1.getOrgName());
        }
        else if(select == "2")
        {
            Beneficiary b = new Beneficiary((id2++), name, phone);
            o1.insertBeneficiary(b);
            System.out.println("Welcome Beneficiary! \n" 
                + "Username: " + name + "\n"
                + "Phone number: " + phone + "\n"
                + "You belong in the Organization " + o1.getOrgName());
        }
        else{
            //Εδώ θέλουμε ένα exception κατά την γνώμη μου που θα κάνει exit το πρόγραμμα
        }
        scanner.close();
    }
}
