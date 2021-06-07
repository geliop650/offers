class Exceptions extends Exception{}
class OverQuantity extends Exception{
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

class InvalidValueException extends Exception{
    public InvalidValueException(String message){
        super(message);
    }
}

class SimilarityException extends Exception{
    public SimilarityException(String message){
        super(message);
    }
}