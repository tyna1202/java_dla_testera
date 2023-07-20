public class Demo {
    public static void main(String[] args){

        User martyna = new User("Martyna", "Szpan", "martyna@gmail.com", 30); // wywołanie konstruktora
        martyna.getAllInfo();



        // dwa sposoby pokazywania wyniku z metody zwracającej
        // 1. system out print:
//        System.out.println(martyna.getUserAge());

        // 2. przypisanie variable - alt + enter po najechaniu na nazwę "getUserAge"
//
//        martyna.getUserAge();
//        int userAge = martyna.getUserAge();
//        System.out.println(userAge);
//
//        boolean userAdult = martyna.isUserAdult();
//        System.out.println("Czy Martyna jest dorosła: "+ userAdult);
//
//        martyna.greetings("Martyna");
//        martyna.greetings("Marta", "Bombka");
//        martyna.howOldAreYou("Marta", 20);
//        int yourAgePlus10 = martyna.yourAgePlus10(userAge);
//        System.out.println(yourAgePlus10);


        User tomek = new User("Tomek", "Brown", "brown@gmail.com", 15);
        tomek.getAllInfo();


//        tomek.firstName = "Tomek";
//        tomek.lastName = "Brown";
//        tomek.email = "brown@gmail.com";
//        tomek.age = 15;
//        tomek.isAdult = false;
//        tomek.getFullName();
//        tomek.getAllInfo();


    }
}
