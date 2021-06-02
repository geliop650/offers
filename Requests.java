import java.util.Iterator;
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
    public void commit(Organization o1, Beneficiary b){
        for (Iterator <RequestDonation> it =  b.getRequestsList().getRdEntities().iterator(); it.hasNext();){
            RequestDonation rd = it.next();
            if(o1.isAvailable(rd)){//overriding τα ifs
                if(validRequestDonation(b)){
                    for(Iterator<RequestDonation> it1 = o1.currentDonations.getRdEntities().iterator(); it1.hasNext();){
                        RequestDonation cr = it1.next();
                        b.addReceived(rd);
                        if(cr.getName().equals(rd.getName())){
                            cr.removeQuantity(rd.getQuantity());

                        }
                    }
                }//else ; exception
            }//else ; exception
        } 
        b.getRequestsList().emptyList();
    }
}