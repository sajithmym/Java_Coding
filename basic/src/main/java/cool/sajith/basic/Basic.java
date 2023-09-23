package cool.sajith.basic;

public class Basic {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int x = 10;

        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is not greater than 5");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Loop iteration " + i);
        }

        x = 1;
        while (x <= 10) {
            System.out.println(x + "....");
            x++;
        }

        int sum = add(10, 20);
        System.out.println("The sum is " + sum);
        
        String a = "sajith-cool";
        char s = '#';
        int b = 10;
        int c = 100;

        String formattedString = String.format("Hello %s age is %d salary %d %c", a, b, c, s);
        System.out.println(formattedString);
    }
}