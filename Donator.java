class Donator extends User
{
    private Offers offersList = new Offers();
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
    public boolean listOffers(){
        if (offersList.getRdEntities().isEmpty())
        {
            System.out.println("The offersList is empty"); 
            return false;
        }
        for (RequestDonation rd : offersList.getRdEntities()){
            System.out.println(String.format("ID: %d Name: %s Quantity: %.2f Type: %s", rd.getID(), rd.getName(), rd.getQuantity(), 
            rd.getEntity().isService() ? "Service" : "Material"));
        }
        return true;
    }
}
