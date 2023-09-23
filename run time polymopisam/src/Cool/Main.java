package Cool;

public class Main {

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("123"));
	    Father f = new Father();
        Sun s = new Sun();

        test saj = new test(10,"sajith");

        System.out.println("Father");
        f.name();
        f.town();
        f.phone();

        System.out.println("\nSun");
        s.name();
        s.town();
        s.phone();
    }
}
