package Cool;

import java.util.List;

public class test {
    public test(int a, String b) {
        System.out.println("Your id "+a+" Name is "+b);
        System.out.println(String.format("\nYour id : %d, your Name is : %s", a, b));
    }

    public void printList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }
}
