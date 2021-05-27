import java.util.ArrayList;
class Donator extends User
{
    private Offers offersList;
    public Donator(int id, String name, String phone){
        setName(name);
        setPhone(phone);
        setID(id);
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