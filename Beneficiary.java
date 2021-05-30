import java.util.ArrayList;
class Beneficiary extends User
{
    private int noPersons = 1;
    public RequestDonationList receivedList;
    public Requests requestsList;
    public int getnoPersons()
    {
        return noPersons;
    }

    public void setnoPersons(int p)
    {
        noPersons = p;
    }

    public void addRequest(Entity e)
    {
        requestsList.add(e);
    }

    public void remove(Requests r)
    {
        requestsList.remove(r);
    }

    public RequestDonationList getReceivedList()
    {
        return receivedList;
    }

    public Requests getRequestsList()
    {
        return requestsList;
    }

    public Beneficiary(int id, String name, String phone)
    {
        setName(name);
        setPhone(phone);
        setID(id);
    }
    
    public String getphone()
    {
        return getPhone();
    }
}