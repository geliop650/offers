public class Offers extends RequestDonationList
{
    public void commit(Organization o)
    {
        for(int i=0; i<rdEntities.size(); i++)
        {
            o.currentDonations.add(rdEntities.get(i));
        }
        for(int i=0; i<rdEntities.size(); i++)
        {
            rdEntities.remove(i);
        }
    }
    public void add(RequestDonation rd)
    {
        add(rd);
    }
}
