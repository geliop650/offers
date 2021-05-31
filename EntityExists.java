public class EntityExists extends Exception{ //Exception σε περίπτωση που ο Admin βάλει ένα Entity που υπάρχει ήδη στον οργανισμό
    public EntityExists(String message){
        super(message);
    }
}