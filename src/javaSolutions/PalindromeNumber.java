package javaSolutions;

public class PalindromeNumber {

    public static boolean isPalindromeNumber(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int remainder = number % 10; // 121 / 10 => 1 / 2- 12 % 10 = 2 /// 1 %10 ==1
            System.out.println(remainder);
            reversedNumber = reversedNumber * 10 + remainder; // 0 * 10 + 1 // reversed number ===
            // 1 // 1 * 10+ 2 = 12

            //12 * 10 = 120+1 = 121

            System.out.print(remainder);
            number = number / 10; // number => 121 / 10 = 12 // 12 / 10 => 1
            // number 1 => 1/10 => 0
            System.out.println(number);
        }
        System.out.println(reversedNumber);
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(121));
    }

}
