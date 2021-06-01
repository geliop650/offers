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
                m1.donatorMenu(s1, o1, m1);
            //μέθοδο για συνέχεια
        }
        else 
        {
            System.out.println ("This user is not yet registered in our system.");
            System.out.println ("Please enter yes to continue with your sign up, or no to exit the program.");
            answer = scanner.nextLine();
            if (answer.equals("yes"))
            {
                m1.signUp(o1, m1);
            }
            else if (answer.equals("no"))
            {
                System.exit(0);
                scanner.close();
            }
        }
        scanner.close();
    }

    public void signUp(Organization o1, Menu m1)
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
                m1.donatorMenu(d, o1, m1);
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

    public void donatorMenu(Donator d, Organization o, Menu m1){
        int select = 0;
        int id = 0;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
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
                String select2;
                double amount = 0;
                double hours = 0;
                System.out.println("Please Select One Of The Following Options: ");
                System.out.println("1) Materials 2) Services ");
                select1 = scanner.nextInt();
                while (select1 < 1 || select > 2){
                    System.out.println("Please Select A Valid Option: ");
                    select1 = scanner.nextInt();
                }
                if(select1 == 1){
                    o.listMaterials();
                    System.out.println("Input the ID of the Material You Want to Contribute: ");
                    id = scanner.nextInt();
                    System.out.println("Input the Amount You Want to Contribute: ");
                    amount = scanner.nextDouble();
                    System.out.println("Confirm the Donations (yes/no): ");
                    select2 = scanner1.nextLine();
                    if (select2.equals("yes")){
                        System.out.println("The Donation was succeed.");
                        RequestDonation req = new RequestDonation(o.getEntityById(id), amount);
                        d.getOffersList().add(req);
                    }else if(select2.equals("no")) System.out.println("The Donation was cancelled.");
                }
                if(select1 == 2){
                    o.listServices();
                    System.out.println("Input the ID of the Service You Want to Contribute: ");
                    id = scanner.nextInt();
                    System.out.println("Input the Amount You Want to Contribute: ");
                    hours = scanner.nextDouble();
                    System.out.println("Confirm the Donation (yes/no): ");
                    select2 = scanner1.nextLine();
                    if (select2.equals("yes")){
                        RequestDonation req = new RequestDonation(o.getEntityById(id), hours);
                        d.getOffersList().add(req);
                    }else System.out.println("The Donation was cancelled.");
                }
                break;

            case 2:
                int select3 = 0;
                String select4;
                String select5;
                double q = 0;
                d.listOffers();
                if (!d.listOffers()){
                    break;
                }
                System.out.println("Please Select One Of The Options: \n" +
                "a) Edit or Delete a Donation \n" +
                "b) Delete All Your Donations \n" +
                "c) Commit ");
                select4 = scanner.nextLine();
                if (select4.equals("a")){
                    System.out.println("Please Select One Of The Donations by its Number: ");
                    select3 = scanner1.nextInt();
                    System.out.println("Please Press d for Delete or e For Edit: ");
                    select5 = scanner1.nextLine();
                    if (select5.equals("d"))
                    {
                        d.getOffersList().remove(select3);
                    }
                    else {
                        System.out.println("Please Enter the New Quantity You Wish to Donate: ");
                        q = scanner1.nextDouble();
                        d.getOffersList().modify(d.getOffersList().get(select3), q);
                    }
                }
                else if (select4.equals("b")){
                    d.getOffersList().reset();
                }
                else if (select4.equals("c")){
                    d.getOffersList().commit(o);
                }
                break;
            case 3:

            //o.currentDonations.rdEntities.add(req);
            break;
            

            case 4:

            break;

            case 5:
                
                break;
            case 6:
                System.exit(0);
                break;
            default :

        }
        m1.donatorMenu(d, o, m1);
        scanner.close();
        scanner1.close();
    }




}
