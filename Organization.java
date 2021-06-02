import java.util.ArrayList;
public class Organization
{
    private String name;
    private Admin admin;
    private int id;
    
    public ArrayList <Entity> entityList = new ArrayList <> ();
    public ArrayList <Donator> donatorList = new ArrayList <> ();
    public ArrayList <Beneficiary> beneficiaryList = new ArrayList <> ();
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
    public void listCurrentMaterials(){
        System.out.println ("Materials: ");
        for (RequestDonation l : currentDonations.getRdEntities())
        {
            if (!l.getEntity().isService)
            {
                System.out.println (String.format("ID: %s Name: %s (Quantity: %d ) ", l.getEntityID(), l.getName(), l.getQuantity()));
            }
        }
    }
    public void listCurrentServices(){
        System.out.println ("Services: ");
        for (RequestDonation l : currentDonations.getRdEntities())
        {
            if (l.getEntity().isService)
            {
                System.out.println (String.format("ID: %s Name: %s (Quantity: %d ) ", l.getEntityID(), l.getName(), l.getQuantity()));
            }
        }
    }
    public void listMaterials(){
        System.out.println ("Materials: ");
        for (Entity e : entityList)
        {
            if (!e.isService())
            {
                System.out.println (String.format("ID: %s Name: %s ", e.getID(), e.getName()));
            }
        }
    } 
    public void listServices(){
        System.out.println ("Services: ");
        for (Entity e : entityList)
        {
            if (e.isService())
            {
                System.out.println (String.format("ID: %s Name: %s ", e.getID(), e.getName()));
            }
        }
    }
    public void listBeneficiaries()
    {
        for (int i=0; i<beneficiaryList.size(); i++)
        {
            System.out.println ("Beneficiary ID " + beneficiaryList.get(i).getID() + " Name: " + beneficiaryList.get(i).getName());
            
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
    public void setID(int iD)
    {
        id = iD;
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
        for (int i=0; i<beneficiaryList.size(); i++)
        {
            if (phone.equals(beneficiaryList.get(i).getPhone()))
            {
                return beneficiaryList.get(i);
            }
        }
        return null;
    }

    public Beneficiary getBeneficiaryById(int id){
        for(Beneficiary b : beneficiaryList){
            if (b.getID() == id){
                return b;
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
        for(RequestDonation l : currentDonations.getRdEntities()){
            if(r.getName().equals(l.getName()) && r.getQuantity() <= l.getQuantity()){
                return true;
            }
        }
        return false;
    }
    public Entity getEntityById(int id){
        for(Entity e : entityList){
            if (e.getID() == id){
                return e;
            }
        }return null;
    }
}