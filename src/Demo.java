public class Demo {
    public static void main(String[] args){

//        User martyna = new User("Martyna", "Szpan", "martyna@gmail.com", 30); // wywołanie konstruktora
//        martyna.getAllInfo();
//
//
//
//        // dwa sposoby pokazywania wyniku z metody zwracającej
//        // 1. system out print:
////        System.out.println(martyna.getUserAge());
//
//        // 2. przypisanie variable - alt + enter po najechaniu na nazwę "getUserAge"
////
////        martyna.getUserAge();
////        int userAge = martyna.getUserAge();
////        System.out.println(userAge);
////
////        boolean userAdult = martyna.isUserAdult();
////        System.out.println("Czy Martyna jest dorosła: "+ userAdult);
////
////        martyna.greetings("Martyna");
////        martyna.greetings("Marta", "Bombka");
////        martyna.howOldAreYou("Marta", 20);
////        int yourAgePlus10 = martyna.yourAgePlus10(userAge);
////        System.out.println(yourAgePlus10);
//
//
//        User tomek = new User("Tomek", "Brown", "brown@gmail.com", 15);
//        tomek.getAllInfo();
//
//
////        tomek.firstName = "Tomek";
////        tomek.lastName = "Brown";
////        tomek.email = "brown@gmail.com";
////        tomek.age = 15;
////        tomek.isAdult = false;
////        tomek.getFullName();
////        tomek.getAllInfo();


//        String str1 = "Hello";
//        String str2 = "hello";


        // PORÓWNANIE DWÓCH STRINGÓW:

//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));


        // ZAMIANA LITER NA WIELKIE/MAŁE

//        String s1 = str1.toUpperCase();
//        System.out.println(s1);
//
//        String s2 = str1.toLowerCase();
//        System.out.println(s2);


        // SPRAWDZANIE CZY TEKST ZACZYNA SIĘ/KOŃCZY NA DANĄ LITERĘ (ZBIÓR LITER) LUB CZY ZAWIERA ZESTAW LITER

//        boolean startsWith = str1.startsWith("He");
//        System.out.println(startsWith);
//
//        System.out.println(str2.endsWith("lo"));
//
//        System.out.println(str2.contains("ll"));



        // METODA IS BLANK VS IS EMPTY

//        System.out.println("    ".isBlank()); // METODA NIE BIERZE POD UWAGĘ SPACJI, SZUKA TYLKO ZNAKÓW
//        System.out.println(" ".isEmpty()); // METODA BIERZE POD UWAGĘ SPACJĘ


        // ZAMIANA TEKSTU


//        String replace = str1.replace("He", "Me");
//        System.out.println(replace);
//
//        String s = str2.replaceAll("l", "r");
//        System.out.println(s);


        // WYCIĄGANIE CZĘŚCI ZE STRINGU

//        String substring = str1.substring(1, 4); // liczone od 0, końcowy index nie jest brany pod uwagę
//        System.out.println(substring);

        // LICZENIE DŁUGOŚCI STRINGA

//        String str3 = "     to jest tekst z pustym miejscem     ";
//
//        System.out.println(str3.length());
//
//        String strip = str3.strip();
//        System.out.println(strip);
//        System.out.println(strip.length());


        User user = new User("Marcin", "Tomb", "marcin@redhat.com", 17);

        System.out.println(user.getEmail());

        user.setEmail("marcin@mail.pl");

        System.out.println(user.getEmail());

    }
}
