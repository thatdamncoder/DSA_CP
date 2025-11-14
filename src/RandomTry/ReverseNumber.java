package RandomTry;

public class ReverseNumber {
    public static int reverse(int num) {
        int result = 0;

        while (num != 0) {
            // Shift the result to the left by 1 position
            result = result << 1;

            // Get the rightmost bit of the number and add it to the result
            result = result | (num & 1);

            // Shift the number to the right by 1 position
            num = num >> 1;
        }

        return result;
    }


    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverse(number);

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}

