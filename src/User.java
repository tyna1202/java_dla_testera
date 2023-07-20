public class User {


    // 1. POLA OBIEKTU
    // OPISUJĄ Z CZEGO SIĘ BĘDZIE SKŁADAŁ DANY OBIEKT

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;


    // 3.KONSTRUKTOR
    // DOMYŚLNY KONSTRUKTOR - TWORZY PUSTY OBIEKT

    // NAZWA KONSTRUKTORA JEST TAKA SAMA JAK NAZWA KLASY
    // KONSTRUKTOR PISZEMY WIELKĄ LITERĄ
    // KONSTRUKTOR NIE MA ZWARACANEGO TYPU (TO GO ODRÓŻNIA OD METODY)


    User(String firstName, String lastName, String email, int age) {


        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.isAdult = isUserAdult();

    }


    // 2. METODY
    // OPISUJĄ CO DANY TYP MOŻE ZROBIĆ


    // zwracany typ + nazwa metody
    //metoda VOID nic nie zwraca - wyświetla jedynie informację na konsolę

    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }


    // metody zwracające - wartość nie jest widoczna, wymagana jest dodatkowa funkcja wyświelenia na konolę

   int getUserAge() {
        return age;
   }

   boolean isUserAdult(){
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
   }

   void greetings(String name){
       System.out.println("Hello " + name + ". Nice to meet you!");
   }

    void greetings(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName + ". Nice to meet you!");
    }

   void howOldAreYou(String name, int userAge) {
       System.out.println("Hello " + name + ". Your are " + userAge + " years old.");

   }

   int yourAgePlus10(int userAge){
        return userAge + 10;
   }




}
