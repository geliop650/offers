public class OverQuantity extends Exception{ //Exception σε περίπτωση που ο Beneficiary ζητάει παραπάνω ή λάθος αριθμό quantity από τον οργανισμό 
    public OverQuantity(String message){
        super(message);
    }
}
