package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPerfectNumber(6));   // true
        System.out.println(isPerfectNumber(28));  // true
        System.out.println(isPerfectNumber(5));   // false
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(123));  // "One Two Three"
        System.out.println(numberToWords(1010)); // "One Zero One Zero"
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number) {


        int originalNumber = Math.abs(number); // Negatif sayıları pozitif yap
        int reversedNumber = 0;
        int tempNumber = originalNumber;

        // Sayıyı ters çevir
        while (tempNumber > 0) {
            int digit = tempNumber % 10; // Son basamağı al
            reversedNumber = reversedNumber * 10 + digit; // Ters sayıyı oluştur
            tempNumber /= 10; // Sayının son basamağını sil
        }

        if(originalNumber == reversedNumber){
            return true;
        }
        return false;
    }
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i=1; i<number; i++)
        {
           if(number%i==0){
               sum +=i;
           }


        }if(sum==number){
            return true;
        }return  false;
    }
    public static String numberToWords(int num){
        if(num<0){
            return "Invalid Value";
        }
        String[] NUMBERS = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };
        String numberString = Integer.toString(num);
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < numberString.length(); i++) {

            int digit = Character.getNumericValue(numberString.charAt(i));

            result.append(NUMBERS[digit]);


            if (i < numberString.length() - 1) {
                result.append(" ");
            }
        }

        return result.toString();

    }





}

