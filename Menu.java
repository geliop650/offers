import java.util.*;
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

        if (phone.equals(o1.getAdmin().getphone()))
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
            if (answer.equals("yes"))
            {
                m1.signUp(o1);
            }
            else if (answer.equals("no"))
            {
                System.exit(0);
                scanner.close();
            }
        }
        scanner.close();
    }

    public void signUp(Organization o1)
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
        if(select.equals("1"))
        {
            Donator d = new Donator((id++), name, phone);
            o1.insertDonator(d);
            System.out.println("Welcome Donator! \n" 
                + "Username: " + name + "\n"
                + "Phone number: " + phone + "\n"
                + "You belong in the Organization " + o1.getOrgName());
        }
        else if(select.equals("2"))
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

    public void donatorMenu(Donator d, Organization o){
        int select = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select One Of The Following Options: ");
        System.out.println("1) Add Offer \n" + 
        "2) Show Offers \n" + 
        "3) Commit \n" +
        "4) Back \n" +
        "5) Logout \n" +
        "6) Exit \n");
        select = scanner.nextInt();
        while (select < 1 || select > 6){
            System.out.println("Please Select A Valid Option: ");
            select = scanner.nextInt();
        }
        switch (select){

            case 1:
                int select1 = 0;
                System.out.println("Please Select One Of The Following Options: ");
                System.out.println("1) Materials 2) Services ");
                select1 = scanner.nextInt();
                while (select1 < 1 || select > 2){
                    System.out.println("Please Select A Valid Option: ");
                    select1 = scanner.nextInt();
                }
                if(select1 == 1){
                    //Να εκτυπώνει το listServices() και listMaterials()
                }
                break;

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:

        }
        scanner.close();
    }




}
