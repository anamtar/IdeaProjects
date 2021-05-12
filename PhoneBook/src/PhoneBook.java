public class PhoneBook {


    public static void main(String[] args) {

        int[] lastDialed = new int[10];
        String kutas;


        printContactCard();
        printContact(2, "Józef", "Cichy", 123456789, 23);
        System.out.println(getContact(3, "Lukas", "Podolski", 28, 456543456));

        System.out.println("-----WEBINAR 3 ----");
        int averageAge = calculateAverageAge(3, 4, 77);
        System.out.println("Sredni wiek to " + averageAge);

        float averageAgeFloat = calculateFloatAverageAge(33, 12, 56);
        System.out.println("Sredni wiek float to " + averageAgeFloat);

        int calculateAverageAge2 = calculateAverageAge2(33.2f, 44.2f, 66.7f);
        System.out.println("Sredni wiek float to int = " + calculateAverageAge2);

        float floatCalculateAverageAge = floatCalculateAverageAge(44.3f, 55.3f, 15.6f);
        System.out.println("Sredni wiek float = " + floatCalculateAverageAge);

        System.out.println("-----WEBINAR 4 ----void printContact(String contact");
        printContactCard("Gruby");

        System.out.println("-----WEBINAR 4 ---- String getContactRaw");
        System.out.println(getContactRaw("Artur", "Maslak", 23, "2323232323", false));

        System.out.println("-----WEBINAR 6 Zmieniona implementacja metod");
        printContactCard2("");
        System.out.println(getContactRaw2("Zenobiusz", "Cichy", 33, "1234567890", false));

        System.out.println("-----WEBINAR 6 tablice");
        System.out.println(getLastDialed());
        System.out.println(getLastDialed2(4));
        System.out.println(dial(6));
        System.out.println(removeLastDialed(3));

    }

    public static void printContactCard() {

        int id = 1;
        String name = "Adam";
        String surname = "Nowak";
        String phoneNumber = "987654321";
        int age = 20;
        String contact = "";
        boolean isHidden = false;

        System.out.println("ID: " + id + "\nImię: " + name + "\nNazwisko: " + surname + "\nWiek: " + age + "\nNumer telefonu: " + phoneNumber);

    }

    public static void printContact(int id, String name, String surname, int phoneNumber, int age) {

        System.out.println(id + "|" + name + "|" + surname + "|" + age + "|" + phoneNumber);

    }

    public static String getContact(int id, String name, String surname, int age, int phoneNumber) {

        return (id + "|" + name + "|" + surname + "|" + age + "|" + phoneNumber);

    }

    public static int calculateAverageAge(int a1, int a2, int a3) {

        return (a1 + a2 + a3) / 3;
    }

    public static float calculateFloatAverageAge(int a1, int a2, int a3) {

        return (float) ((a1 + a2 + a3) / 3);

    }

    public static int calculateAverageAge2(float a1, float a2, float a3) {

        return (int) ((a1 + a2 + a3) / 3.0f);
    }

    public static float floatCalculateAverageAge(float a1, float a2, float a3) {

        return (a1 + a2 + a3) / 3;

    }

    public static void printContactCard(String contact) {

        int id = 1;
        String name = "Adam";
        String surname = "Nowak";
        String phoneNumber = "987654321";
        int age = 20;
        boolean isHidden = false;

        System.out.println("To jest kontakt o nazwie " + contact + ". Jego dane to: " + "\nID: " + id + "\nImię: " + name + "\nNazwisko: " + surname + "\nWiek: " + age + "\nNumer telefonu: " + phoneNumber);


    }

    public static String getContactRaw(String name, String surname, int age, String number, boolean isHidden) {

        int id = 1;

        return id + " ; " + name + " ; " + surname + " ; " + age + " ; " + number + " ; " + isHidden;

    }

    public static void printContactCard2(String contact) {

        int id = 1;
        String name = "Adam";
        String surname = "Nowak";
        String phoneNumber = "987654321";
        int age = 20;
        boolean isHidden = false;

        if (contact == "") {
            contact = "NIEZNANY";
            System.out.println("Kontakt nieznany");
        } else {
            System.out.println("To jest kontakt o nazwie " + contact + ". Jego dane to: " + "\nID: " + id + "\nImię: " + name + "\nNazwisko: " + surname + "\nWiek: " + age + "\nNumer telefonu: " + phoneNumber);

        }

    }

    public static String getContactRaw2(String name, String surname, int age, String number, boolean isHidden) {

        int id = 1;

        if (number.length() < 9 || number.length() > 9) {

            number = "000000000";
            return (id + " ; " + name + " ; " + surname + " ; " + age + " ; " + number + " ; " + isHidden);

        } else {

            return id + " ; " + name + " ; " + surname + " ; " + age + " ; " + number + " ; " + isHidden;
        }

    }


    public static int getLastDialed() {

        int[] lastDialed = new int[10];

        return lastDialed[0];

    }

    public static int getLastDialed2(int index) {

        int[] lastDialed = new int[10];

        lastDialed[index] = 0;

        return lastDialed[index];
    }

    public static int dial(int id) {

        int[] lastDialed = new int[10];

        lastDialed[0] = id;

        return lastDialed[0];
    }

    public static int removeLastDialed(int index) {

        int[] lastDialed = new int[10];

        lastDialed[index] = 0;

        return lastDialed[index];
    }

}




