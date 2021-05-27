import java.util.ArrayList;
public class RequestDonationList
{
    public ArrayList<RequestDonation>rdEntities;
    private int id;
    public RequestDonation get(int id)
    { 
        int j=0;
        for (int i=0; i<rdEntities.size(); i++)
        {
            if (id == rdEntities.get(i).getiD())
            {
                j=i;
            }
        }
        return rdEntities.get(j);
    }
    public void add(RequestDonation R)
    {
        for (int i=0; i<rdEntities.size(); i++)
        {
            if (R.getiD() == rdEntities.get(i).getiD())
            {
                double newq;
                newq = rdEntities.get(i).getQuantity() + R.getQuantity();
                rdEntities.get(i).setQuantity(newq);
            }
            else rdEntities.add(R);
        }
    }
    public void remove(RequestDonation R)
    {
        rdEntities.remove(R);
    }
    public void modify(RequestDonation R, double q)
    {
        for (int i=0; i<rdEntities.size(); i++)
        {
            if (R.getiD() == rdEntities.get(i).getiD())
            {
                rdEntities.get(i).setQuantity(q);
            }
        }
    }
    public void monitor()
    {
        for (int i=0; i<rdEntities.size(); i++)
        {
            System.out.println("Request No." + (i+1) + " is " + rdEntities.get(i) + "and it's quantity is " + rdEntities.get(i).getQuantity());
        }
    }
    public void reset()
    {
        rdEntities.clear();
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