import java.util.ArrayList;
public class Organization
{
    private String name;
    private Admin admin;
    private int id;
    
    public ArrayList <Entity> entityList = new ArrayList <Entity> ();
    public ArrayList <Donator> donatorList = new ArrayList <Donator> ();
    public ArrayList <Beneficiary> beneficiaryList = new ArrayList <Beneficiary> ();
    public RequestDonationList currentDonations;
    public Organization(String org)
    {
        name = org;
    }
    public void setAdmin(Admin a1)
    {
        admin = a1;
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
            if (!entityList.get(i).isService)
            {
                System.out.println ("No." + (i+1) + entityList.get(i).getName());    
            }
        }
        System.out.println();
        System.out.println ("Services: ");
        for (int i=0; i<entityList.size(); i++)
        {
            if (entityList.get(i).isService)
            {
                System.out.println ("No." + (i+1) + entityList.get(i).getName());    
            }
        }
    }
    public void listMaterials(){
        System.out.println ("Materials: ");
        for (RequestDonation l : currentDonations.rdEntities)
        {
            if (!l.getEntity().isService)
            {
                System.out.println (String.format("ID: %s Name: %s (Quantity: %d ) ", l.getID(), l.getName(), l.getQuantity()));
            }
        }
    }
    public void listServices(){
        System.out.println ("Services: ");
        for (RequestDonation l : currentDonations.rdEntities)
        {
            if (l.getEntity().isService)
            {
                System.out.println (String.format("ID: %s Name: %s (Quantity: %d ) ", l.getID(), l.getName(), l.getQuantity()));
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
    public RequestDonationList getCurrentDonations()
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
        ADMIN, DONATOR, BENEFICIARY;
    }
    
    public Beneficiary getBeneficiary(String phone){
        for (int i=0; i<donatorList.size(); i++)
        {
            if (phone.equals(beneficiaryList.get(i).getPhone()))
            {
                return beneficiaryList.get(i);
            }
        }
        return null;
    }
    
    public Donator getDonator(String phone){
        for (int i=0; i<donatorList.size(); i++)
        {
            if (phone.equals(donatorList.get(i).getPhone()))
            {
                return donatorList.get(i);
            }
        }
        return null;
    }
    public String getOrgName()
    {
        return name;
    }
    
    public void setOrgName(String org)
    {
        name = org;
    }

    public boolean isAvailable(RequestDonation r){
        for(RequestDonation l : currentDonations.rdEntities){
            if(r.getName().equals(l.getName()) && r.getQuantity() <= l.getQuantity()){
                return true;
            }
        }
        return false;
    }
}