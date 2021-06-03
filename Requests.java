import java.util.Iterator;
public class Requests extends RequestDonationList
{
    public boolean validRequestDonation(Beneficiary b, double q)
    {
        for (RequestDonation r : getRdEntities()){
            if(!r.isValid(b, q)){
                return false;
            }
        }
        return true;
    }
    public void add(Organization o1, RequestDonation rd, Beneficiary b){
        double q = 0;
        if(o1.isAvailable(rd)){//overriding τα ifs
            if(validRequestDonation(b, q)){
                add(rd);
                System.out.println("The Request Has Been Succesfully Submitted.");
            }else {System.out.println("You are not permitted to ask for this quantity"); return;}// exception
        }else {System.out.println("The organization doesn't have that much quantity");}//exception
    }
    public void modify(Organization o1, RequestDonation rd, Beneficiary b, double q){
        if(o1.isAvailable(rd)){//overriding τα ifs
            if(validRequestDonation(b, q)){
                modify(rd, q);
                System.out.println("The Quantity of The Requested Item Has Changed.");
            }{System.out.println("You are not permitted to ask for this quantity"); return;}
        }{System.out.println("The organization doesn't have that much quantity");}
    }
    public boolean commit(Organization o1, Beneficiary b){
        for (Iterator <RequestDonation> it =  b.getRequestsList().getRdEntities().iterator(); it.hasNext();){
            RequestDonation rd = it.next();
            double q = 0;
            if(o1.isAvailable(rd)){//overriding τα ifs
                if(validRequestDonation(b, q)){
                    for(Iterator<RequestDonation> it1 = o1.currentDonations.getRdEntities().iterator(); it1.hasNext();){
                        RequestDonation cr = it1.next();
                        b.addReceived(rd);
                        b.getRequestsList().emptyList();
                        if(cr.getName().equals(rd.getName())){
                            cr.removeQuantity(rd.getQuantity());
                        }
                    }
                    System.out.println("Your Changes Have Been Saved!"); 
                    return true;
                }else {System.out.println("You are not permitted to ask for this quantity"); return false;} //exception
            }else {System.out.println("The organization doesn't have that much quantity"); return false;}// exception
        }return true;
        
    }
}