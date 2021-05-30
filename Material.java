public class Material extends Entity 
{
    private double level1; // Ποσότητα που δικαιούται ένα άτομο
    private double level2; // Ποσότητα που δικαιούνται 2-4 άτομα
    private double level3; // Ποσότητα που δικαιούνται 5+ άτομα
    public String getDetails()
    {
        return "This is a Material." + "For families with one member, the quantity is: " + this.level1 + ", for families with 2-4 members, the quantity is: "
        + this.level2 + " , for families with 5 members or more, the quantity is: " + this.level3;
    }
    public Material (int id, String name,/*description*/ double l1, double l2, double l3)
    {
        setID(id);
        setName(name);
        setIsService(false);/*enum required*/
        level1 = l1;
        level2 = l2;
        level3 = l3;
    }
    @Override
    public double getLevel1()
    {
        return level1;
    }
    @Override
     public double getLevel2()
    {
        return level2;
    }
    @Override
     public double getLevel3()
    {
        return level3;
    }
}