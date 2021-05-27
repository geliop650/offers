import java.util.ArrayList;
public class Organization
{
    private String name;
    private Admin admin;
    private int id;
    
    public ArrayList <Entity> entityList;
    public ArrayList <Donator> donatorList;
    public ArrayList <Beneficiary> beneficiaryList;
    public ArrayList <RequestDonationList> currentDonations;
    public void setAdmin(String Name, String Phone)
    {
        admin.setName(Name);
        admin.setPhone(Phone);
    }
    public Admin getAdmin()
    {
        return admin;
    }
    public void addEntity(Entity entity)
    {
        entityList.add(entity);
    }
    public void removeEntity(Entity entity)
    {
       if (admin.getIsAdmin()) entityList.remove(entity);
    }
    public void insertDonator(Donator d)
    {
        donatorList.add(d);
    }
    public void removeDonator(Donator d)
    {
        donatorList.remove(d);
    }
    public void insertBeneficiary(Beneficiary b)
    {
        beneficiaryList.add(b);
    }
    public void removeBeneficiary(Beneficiary b)
    {
        beneficiaryList.remove(b);
    }
    public void listEntities()
    {
        System.out.println("The available entities are: Materials and Services.");
        System.out.println ("Materials: ");
        for (int i=0; i<entityList.size(); i++)
        {
            if (entityList.get(i).getmatORser() == 1)
            {
                System.out.println ("No." + (i+1) + entityList.get(i));    
            }
        }
        System.out.println();
        System.out.println ("Services: ");
        for (int i=0; i<entityList.size(); i++)
        {
            if (entityList.get(i).getmatORser() == 0)
            {
                System.out.println ("No." + (i+1) + entityList.get(i));    
            }
        }
    }
    public void listBeneficiaries()
    {
        for (int i=0; i<beneficiaryList.size(); i++)
        {
            System.out.println ("Beneficiary No " + (i+1) + " is " + beneficiaryList.get(i).getName());
            
        }
    }
    public void listDonators()
    {
        for (int i=0; i<donatorList.size(); i++)
        {
           System.out.println ("Donator No " + (i+1) + " is " + donatorList.get(i).getName());
        }
    }
    public ArrayList <RequestDonationList> getCurrentDonations()
    {
        return currentDonations;
    }
    public void setID(int ID)
    {
        id = ID;
    }
    public int getID()
    {
        return id;
    }
    public enum UserStatus
    {
        Admin, Donator, Beneficiary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        name = name;
    }
    public int  isBeneficiary(String phone)
    {
        int j=-1;
        for (int i=0; i<beneficiaryList.size(); i++)
        {
            if (phone == beneficiaryList.get(i).getPhone())
            {
                 j=i;
                 System.out.println("Name: " + beneficiaryList.get(i).getName());
            }
        }
        return j;
    }
    public int  isDonator(String phone)
    {
        int j=-1;
        for (int i=0; i<donatorList.size(); i++)
        {
            if (phone == donatorList.get(i).getPhone())
            {
                 j=i;
                 System.out.println("Name: " + donatorList.get(i).getName());
            }
        }
        return j;
    }
}