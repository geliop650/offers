import java.util.ArrayList;
public class RequestDonationList
{
    private ArrayList<RequestDonation> rdEntities = new ArrayList <> ();
    private int id;
    public RequestDonation get(int id)
    { 
        for (RequestDonation rd : rdEntities)
        {
            if (id == rd.getID())
            {
                return rd;
            }
        }return null;
        
    }
    public void add(RequestDonation R)
    {
        for (int i=0; i<rdEntities.size(); i++)
        {
            if (R.getEntityID() == rdEntities.get(i).getEntityID())
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
    public void remove(int id)
    {
        remove(rdEntities.get(id));
    }
    public void modify(RequestDonation r, double q)
    {
        for (int i=0; i<rdEntities.size(); i++)
        {
            if (r.getEntityID() == rdEntities.get(i).getEntityID())
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
    public ArrayList<RequestDonation> getRdEntities(){
        return rdEntities;
    }
}