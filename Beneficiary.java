import java.util.ArrayList;
class Beneficiary extends User
{
    private int noPersons = 1;
    public ArrayList<RequestDonationList>receivedList;
    public ArrayList<Requests>requestsList;
    public int getnoPersons()
    {
        return noPersons;
    }

    public void setnoPersons(int p)
    {
        noPersons = p;
    }

    public void add(Requests r)
    {
        requestsList.add(r);
    }

    public void remove(Requests r)
    {
        requestsList.remove(r);
    }

    public ArrayList<RequestDonationList> getReceivedList()
    {
        return receivedList;
    }

    public ArrayList<Requests> getRequestsList()
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