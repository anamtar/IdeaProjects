package exceptions_examples.exception;

public class ImproperNumberException extends Exception {

    private String enteredNumber;

    public ImproperNumberException(String number){
        enteredNumber = number;
    }

    public String getEnteredNumber(){
        return enteredNumber;
    }

}
