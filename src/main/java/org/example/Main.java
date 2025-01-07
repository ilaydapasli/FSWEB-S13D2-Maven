package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(4554));
    }

    public static boolean isPalindrome(int number) {


        int originalNumber = number;
        int reversedNumber = 0;

        // Sayıyı ters çevir
        while (number > 0) {
            int digit = number % 10; // Son basamağı al
            reversedNumber = reversedNumber * 10 + digit; // Ters sayıyı oluştur
            number /= 10; // Sayının son basamağını sil
        }

        if (originalNumber == reversedNumber){
            return true;
        }
        return false;
    }


}

