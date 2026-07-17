package code;

class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String message){
        super(message);
    }
}
