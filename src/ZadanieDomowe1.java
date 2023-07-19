public class ZadanieDomowe1 {

    public static void main(String[] args){

        int numberOne = 3;
        int numberTwo = 4;
        int numberThree = 12;
        int numberFour = 54;


        // sprawdź czy suma dwóch pierwszych liczb jest parzysta

        if ((numberOne+numberTwo) % 2 == 0) {
            System.out.println("Suma dwóch pierwszych liczb jest parzysta.");
        } else {
                System.out.println("Suma dwóch pierwszych liczb nie jest parzysta.");
            }

        // sprawdź czy suma dwóch pozostałych liczb jest parzysta

        if ((numberThree+numberFour) % 2 == 0) {
            System.out.println("Suma dwóch pozostałych liczb jest parzysta.");
        } else {
            System.out.println("Suma dwóch pozostałych liczb nie jest parzysta.");
        }

        // jeśli dwie sumy są parzyste to wyświetl informację, że wszystkie liczby są parzyste

        if ((numberOne+numberTwo) % 2 == 0 && (numberThree+numberFour) % 2 == 0) {
            System.out.println("Wszystkie liczby są parzyste"); }
                else {
                    System.out.println("Nie wszystkie liczby są parzyste");
            }

        }
}
