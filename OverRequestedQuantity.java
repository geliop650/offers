public class OverRequestedQuantity extends Exception{ //Exception σε περίπτωση που ο Beneficiary ζητάει παραπάνω quantity από ότι δικαιούται 
    public OverRequestedQuantity(String message){
        super(message);
    }
}