import java.util.ArrayList;
class Donator extends User
{
    private Offers offersList;
    public Donator(String Name, String Phone){
        setName(Name);
        setPhone(Phone);
    }
    public void add(RequestDonation rd)
    {
        offersList.add(rd);
    }
    public void remove(RequestDonation rd)
    {
        offersList.remove(rd);
    }
    public Offers getOffersList()
    {
        return offersList;
    }
}