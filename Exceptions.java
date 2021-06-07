class OverQuantity extends Exception{ //Exception σε περίπτωση που ο Beneficiary ζητάει παραπάνω ή λάθος αριθμό quantity από τον οργανισμό 
    public OverQuantity(String message){
        super(message);
    }
}

class LevelException extends Exception{
    public LevelException(String message){
        super(message);
    }
}

class InvalidCharacterException extends Exception{
    public InvalidCharacterException(String message){
        super(message);
    }
}

class NumberFormatException extends Exception{
    public NumberFormatException(String message){
        super(message);
    }
}

class InvalidValueException extends Exception{
    public InvalidValueException(String message){
        super(message);
    }
}

class InputMismatchException extends Exception{
    public InputMismatchException(String message){
        super(message);
    }
}

class SimilarityException extends Exception{
    public SimilarityException(String message){
        super(message);
    }
}