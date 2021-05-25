public class Main
{
    public static void main (String [] args)
    {
        Organization org = new Organization();
        Entity milk = new Material();
        Entity sugar = new Material();
        Entity rice = new Material();
        org.addEntity(milk);
        org.addEntity(sugar);
        org.addEntity(rice);
        Entity MedicalSupport = new Service();
        Entity NurserySupport = new Service();
        Entity Babysitting = new Service();
        org.addEntity(MedicalSupport);
        org.addEntity(NurserySupport);
        org.addEntity(Babysitting);
        Admin ad = new Admin();
        Beneficiary b1 = new Beneficiary();
        Beneficiary b2 = new Beneficiary();
    }
}