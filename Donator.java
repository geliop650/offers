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
    public void listOffers(){
        for (RequestDonation rd : offersList.rdEntities){
            System.out.println(String.format("ID: %d Name: %s Quantity: %d Type: %s", rd.getID(), rd.getName(), rd.getQuantity(), 
            rd.getEntity().isService() ? "Service" : "Material"));
        }

        }
}
