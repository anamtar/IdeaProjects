package exceptions_examples;

import exceptions_examples.exception.ImproperNameException;
import exceptions_examples.exception.ImproperNumberException;

public class ExceptionsApp {

    public static void main(String[] args) {

        String name = "unknown";
        String number = "12345678";

        try {
            checkName(name); }
        catch (ImproperNameException e){
            System.out.println("Podałeś niepoprawne imię");
            e.printStackTrace();
        }

        try{
            checkNumber(number);
        } catch (ImproperNumberException e) {
            System.out.println("Podany numer jest niepoprwany");
            System.out.println("Podany numer to " + e.getEnteredNumber());
            e.printStackTrace(); //stacktrace jest zwracany i podaje informacje, gdzie pojawił się bląd. On nie musi być prontowany
        } finally {
            System.out.println("A to jest kod, który wykona się zawsze");
        }

        if(name.equals("unknown")){

            throw new ImproperNameException();
        }

        int[] numbers = {1,2,3,4,5};

        System.out.println(numbers[2]);
    }

    public static void checkName(String name){
        if (name.equals("unknown")){
            throw new ImproperNameException(); //można nie robić try catch, apka się zatrzyma
        }
    }

    public static void checkNumber(String number) throws ImproperNumberException {
        if (number.length() < 9){
            throw new ImproperNumberException(number);
        }
    }

}
