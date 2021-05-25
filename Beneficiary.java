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
}