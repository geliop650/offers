public class Offers extends RequestDonationList
{
    public void commit(Organization o)
    {
        for(int i=0; i<getRdEntities().size(); i++)
        {
            o.currentDonations.add(getRdEntities().get(i));
        }
        for(int i=0; i<getRdEntities().size(); i++)
        {
            getRdEntities().remove(i);
        }
    }
}
