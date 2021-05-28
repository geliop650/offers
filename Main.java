public class Main
{
    public static void main (String [] args)
    {
        Organization org = new Organization("myOrg");
        Entity milk = new Material("Milk" , 1);
        Entity sugar = new Material("Sugar" , 2);
        Entity rice = new Material("Rice" , 3);
        org.addEntity(milk);
        org.addEntity(sugar);
        org.addEntity(rice);
        Entity MedicalSupport = new Service("MedicalSupport" , 1);
        Entity NurserySupport = new Service("NurserySupport", 2);
        Entity Babysitting = new Service("Babysitting" , 3);
        org.addEntity(MedicalSupport);
        org.addEntity(NurserySupport);
        org.addEntity(Babysitting);
        Admin ad = new Admin(1, "Maria" ,"6955555555");
        Beneficiary b1 = new Beneficiary(1, "Kostas", "6944444444");
        org.insertBeneficiary(b1);
        Beneficiary b2 = new Beneficiary(2, "Giorgos" , "698888888");
        org.insertBeneficiary(b2);
        Donator d1 = new Donator(1, "Takis", "697777777");
        org.insertDonator(d1);
        Menu m1 = new Menu();
        m1.start(ad, org, m1);
    }
}