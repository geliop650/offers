class Donator extends User {
	private Offers offersList;

	public Donator(String name, String phone) {
		setName(name);
		setPhone(phone);
	}

	public void addOffer(RequestDonation requestDonation)
	{
		offersList.add(requestDonation);
	}
}