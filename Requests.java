public class Requests extends RequestDonationList
{
    public boolean validRequestDonation(Beneficiary b)
    {
        for (RequestDonation r : getRdEntities()){
            if(!r.isValid(b)){
                return false;
            }
        }
        return true;
    }
    public void add(Organization o1, RequestDonation rd, Beneficiary b){
        if(o1.isAvailable(rd)){//overriding τα ifs
            if(validRequestDonation(b)){
                add(rd);
            }//else ; exception
        }//else ; exception
    }
    public void modify(Organization o1, RequestDonation rd, Beneficiary b, double q){
        if(o1.isAvailable(rd)){//overriding τα ifs
            if(validRequestDonation(b)){
                modify(rd, q);
            }//else ; exception
        }//else ; exception
    }
    public void commit(Organization o1, RequestDonation rd, Beneficiary b){
        if(o1.isAvailable(rd)){//overriding τα ifs
            if(validRequestDonation(b)){
                for(RequestDonation cr : getRdEntities()){
                    if(cr.getName().equals(rd.getName())){
                        cr.removeQuantity(rd.getQuantity());
                        b.addReceived(rd);
                        return;
                    }
                }
            }//else ; exception
        }//else ; exception
    }
}