import java.util.ArrayList;
public class RequestDonation 
{
    private Entity entity;
    private double quantity;
    private int id;
    public void setQuantity(double q)
    {
        quantity = q;
    }
    public double getQuantity()
    {
        return quantity;
    }
    public int getiD()
    {
        int id = entity.getID();
        return id;
    }
    public int getmatOrser()
    {
        int matorser = entity.getmatORser();
        return matorser;
    }
    public void setID(int ID)
    {
        id = ID;
    }
    public int getID()
    {
        return id;
    }
}

