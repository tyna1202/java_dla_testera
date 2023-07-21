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


//        User user = new User("Marcin", "Tomb", "marcin@redhat.com", 17);
//
//        System.out.println(user.getEmail());
//
//        user.setEmail("marcin@mail.pl");
//
//        System.out.println(user.getEmail());


        // TABLICE
        // 1. Zbiór danych tego samego typu
        // 2. Zawsze musimy określić jej rozmiar
        // 3. Ostatni element to długość tablicy -1
        // 4. [] - tablica
        // 5. int[] numbers = new int[]

//        String[] names = new String[5];

        // wartości tablicy: ["Marian", "Jola", "Katarzyna", "Kacper", "Darek"]
        // indexy wartości:  [    0,       1,        2,          3,       4   ]

//        names[0] = "Marian";
//        names[1] = "Jola";
//        names[2] = "Katarzyna";
//        names[3] = "Kacper";
//        names[4] = "Darek";
//
//        // for(licznik; warunek; zmiana_licznika)
//
//     for(int i = 0; i < names.length; i++) {
//         if(i % 2 == 0) {                       //wyświetlanie tylko parzystych indexów
//             System.out.println(names[i]);
//         }
//     }


     // PĘTLA FOR EACH

//        for (String name: names) {
//            System.out.println(name);
//        }


        // PĘTLA WHILE

//        int i = 10;
//
//        while (i < 20) {
//            System.out.println(i);
//            i++;
//        }

        // PĘTLA DO WHILE

//        int i = 10;
//
//        do{
//            System.out.println("ta liczba jest w pętli do: ");
//            System.out.println(i);
//            i++;
//        } while (i < 20);


        // USER COUNTER

        User u1 = new User ("Jacek", "Borowik", "jacek@gmail.com", 56);
        User u2 = new User ("Jacek", "Borowik", "jacek@gmail.com", 56);
        User u3 = new User ("Jacek", "Borowik", "jacek@gmail.com", 56);
        User u4 = new User ("Jacek", "Borowik", "jacek@gmail.com", 56);
        User u5 = new User ("Jacek", "Borowik", "jacek@gmail.com", 56);

        System.out.println(User.getUserCounter());

    }
}
