package Cool;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to My Environment...");

        cal1 s = new cal1(100,1);
        cal1 a = new cal1();
        cal3 x = new cal3(2,4);

        s.add();
        x.add();

        x.sub();
        a.sub(99,22);

        x.mul();
        x.div();

        x.other();

    }
}
