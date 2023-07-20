public class Zadanie_domowe_3 {

    public static void main(String[] args) {

//        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};


        // ZADANIE 1 Uszereguj podane liczby rosnąco

//        int min;
//
//        for (int i = 0; i < numbers.length; i++) {
//            min = numbers[i];
//            for (int j = i + 1 ; j < numbers.length; j++) {
//                if (numbers[j] < min) {
//                    min = numbers[j];
//                    numbers[j] = numbers[i];
//                    numbers[i] = min;
//                }
//            }
//        }
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }


        // ZADANIE 2 Uszereguj podane liczby malejąco

//        int max;
//
//        for (int i = 0; i < numbers.length; i++) {
//            max = numbers[i];
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[j] > max) {
//                    max = numbers[j];
//                    numbers[j] = numbers[i];
//                    numbers[i] = max;
//                }
//            }
//        }
//        for (int number : numbers) {
//            System.out.println(number);
//        }


        // ZADANIE 3 Policz ile jest liczb parzystych i nieparzystych w tabeli


//        int[] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};
//
//        int even = 0;
//        int odd = 0;
//
//        for(int i = 0; i < numbers.length; i++) {
//            if (i % 2 == 0){
//                ++even;
//            } else {
//                ++odd;
//            }
//
//        }
//        System.out.println("liczb parzystych: " + even);
//        System.out.println("Liczb nieparzystych: " + odd);


        // ZADANIE 4 Zamień pierwszy element tablicy z ostatnim


        int[] numbers = {1, 2, 3, 4, 5};

        // a) dwie zmienne
//
//        int first = numbers[0];
//        int last = numbers[numbers.length - 1];
//
//        numbers[0] = last;
//        numbers[numbers.length - 1] = first;
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        // b) jedna zmienna

//        int first = numbers[0];
//        numbers[0] = numbers[numbers.length - 1];
//        numbers[numbers.length - 1] = first;
//
//
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        // c) żadna dodatkowa zmienna


        numbers[numbers.length -1] = numbers[numbers.length - 1] + numbers[0];  // przypisana jest 6
        numbers[0] = numbers[numbers.length - 1] - numbers[0];                  // przypisana jest 5
        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0]; // przypisana jest 1

        for (int number : numbers) {
            System.out.println(number);
        }


    }
}
