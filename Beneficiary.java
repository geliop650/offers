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

    public void addRequest(RequestDonation rd)
    {
        requestsList.add(rd);
    }

    public void remove(RequestDonation rd)
    {
        requestsList.remove(rd);
    }

    public void addReceived(RequestDonation rd)
    {
        receivedList.add(rd);
    }

    public RequestDonationList getReceivedList()
    {
        return receivedList;
    }

    public Requests getRequestsList()
    {
        return requestsList;
    }

    public Beneficiary(int id, String name, String phone, int person)
    {
        setName(name);
        setPhone(phone);
        setID(id);
        setnoPersons(person);
    }
}