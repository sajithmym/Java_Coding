package Cool;

public class Main {

    public static void main(String[] args) {
	    Father f = new Father();
        Sun s = new Sun();

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
