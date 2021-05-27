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
    public Material (String Name, int id)
    {
        setName(Name);
        setID(id);
        setmatORser(1);   
    }
    public double getLevel1()
    {
        return level1;
    }
     public double getLevel2()
    {
        return level2;
    }
     public double getLevel3()
    {
        return level3;
    }
    public void setLevel1(double d)
    {
        level1 = d;
    }
     public void setLevel2(double d)
    {
        level2 = d;
    }
     public void setLevel3(double d)
    {
        level3 = d;
    }
}