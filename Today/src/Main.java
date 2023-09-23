import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String str = "Sajith CoOl!";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println(reversedStr);

        System.out.print(" Enter : ");
        int num = get.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        str = "123";
        int intValue = Integer.parseInt(str);
        System.out.println("\n Converted int value: " + intValue);

        str = "3.14";
        float floatValue = Float.parseFloat(str);
        System.out.println("Converted float value: " + floatValue);

        str = "Hello";
        char charValue = str.charAt(0);
        System.out.println("First character: " + charValue);

        intValue = 42;
        String strValue = Integer.toString(intValue);
        System.out.println("Converted String value: " + strValue);

        floatValue = 3.14f;
        strValue = Float.toString(floatValue);
        System.out.println("Converted String value: " + strValue);

    }
}