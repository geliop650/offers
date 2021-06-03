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
    public void add(RequestDonation r)
    {
        for (RequestDonation rd : rdEntities)
        {
            if (r.getEntityID() == rd.getEntityID())
            {
                double newq;
                newq = rd.getQuantity() + r.getQuantity();
                rd.setQuantity(newq);
                return;
            }
            
        }
        r.setID(rdEntities.size() + 1);
        rdEntities.add(r);

    }
    public void remove(RequestDonation r)
    {
        rdEntities.remove(r);
    }
    public void removeById(int id)
    {
        remove(get(id));
    }
    public void emptyList(){
        rdEntities = new ArrayList <> ();
    }
    public void modify(RequestDonation r, double q)
    {
        for (RequestDonation rd : rdEntities)
        {
            if (r.getID() == rd.getID())
            {
                r.setQuantity(q);
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
    public void setID(int id1)
    {
        id = id1;
    }
    public int getID()
    {
        return id;
    }
    public double getTotalQuantity(String entityName, Beneficiary b, double tempQ){
        double total = 0;
        double addedValue = 0;
        for (RequestDonation r : b.getReceivedList().rdEntities){
            if(r.getEntity().getName().equals(entityName)){
                total = r.getQuantity();
            }else return total;
        }
        for (RequestDonation r : b.getRequestsList().getRdEntities()){
            if (r.getEntity().getName().equals(entityName)) {
                if (tempQ == 0){
                    addedValue = r.getQuantity();
                } else addedValue = tempQ;
                total = addedValue;            
            }
        }
        return total;
    }
    public ArrayList<RequestDonation> getRdEntities(){
        return rdEntities;
    }
    public RequestDonation getByName(String n){
        for(RequestDonation rd : rdEntities){
            if (rd.getName().equals(n)){
                return rd;
            }
        }
        return null;
    }
}