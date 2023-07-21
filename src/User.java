public class User {


    private static int userCounter = 0; // pola statyczne należą do klasy a nie należą do obiektu

    // 1. POLA OBIEKTU
    // OPISUJĄ Z CZEGO SIĘ BĘDZIE SKŁADAŁ DANY OBIEKT

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;


    // 3.KONSTRUKTOR
    // DOMYŚLNY KONSTRUKTOR - TWORZY PUSTY OBIEKT

    // NAZWA KONSTRUKTORA JEST TAKA SAMA JAK NAZWA KLASY
    // KONSTRUKTOR PISZEMY WIELKĄ LITERĄ
    // KONSTRUKTOR NIE MA ZWARACANEGO TYPU (TO GO ODRÓŻNIA OD METODY)


    public User(String firstName, String lastName, String email, int age) {


        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.isAdult = isUserAdult();
        userCounter++;

    }


    // 2. METODY
    // OPISUJĄ CO DANY TYP MOŻE ZROBIĆ


    // zwracany typ + nazwa metody
    //metoda VOID nic nie zwraca - wyświetla jedynie informację na konsolę

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
       if (email.endsWith(".ru")) {
           System.out.println("RU emails are not allowed");
       } else {
           this.email = email;
       }
    }
    public void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }


    // metody zwracające - wartość nie jest widoczna, wymagana jest dodatkowa funkcja wyświelenia na konolę

   public int getUserAge() {
        return age;
   }

   public boolean isUserAdult(){
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
   }

   public void greetings(String name){
       System.out.println("Hello " + name + ". Nice to meet you!");
   }

    public void greetings(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName + ". Nice to meet you!");
    }

   public void howOldAreYou(String name, int userAge) {
       System.out.println("Hello " + name + ". Your are " + userAge + " years old.");

   }

   public int yourAgePlus10(int userAge){
        return userAge + 10;
   }

    public static int getUserCounter(){
        return userCounter;
    }


}
