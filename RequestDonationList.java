import java.util.ArrayList;
public class RequestDonationList
{
    public ArrayList<RequestDonation> rdEntities = new ArrayList <RequestDonation> ();
    private int id;
    public RequestDonation get(int id)
    { 
        int j=0;
        for (int i=0; i<rdEntities.size(); i++)
        {
            if (id == rdEntities.get(i).getID())
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
            if (R.getID() == rdEntities.get(i).getID())
            {
                double newq;
                newq = rdEntities.get(i).getQuantity() + R.getQuantity();
                rdEntities.get(i).setQuantity(newq);
            }
            else rdEntities.add(R);
        }
    }
    public void remove(RequestDonation r)
    {
        rdEntities.remove(r);
    }
    public void modify(RequestDonation r, double q)
    {
        for (int i=0; i<rdEntities.size(); i++)
        {
            if (r.getID() == rdEntities.get(i).getID())
            {
                rdEntities.get(i).setQuantity(q);
            }
        }
    }
    public void monitor()
    {
        for (int i=0; i<rdEntities.size(); i++)
        {
            System.out.println("Request No." + (i+1) + " is " + rdEntities.get(i).getName() + "and it's quantity is " + rdEntities.get(i).getQuantity());
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
    public double getTotalQuantity(String n){
        double total = 0;
        for (RequestDonation r : rdEntities){
            if (r.getEntity().getName().equals(n)) total += r.getQuantity();
        }
        return total;
    }
}