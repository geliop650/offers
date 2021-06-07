public class InvalidOption extends Exception{ //Exception σε περίπτωση που ο Beneficiary ζητάει παραπάνω quantity από ότι δικαιούται 
    public InvalidOption(String message){
        super(message);
    }
}