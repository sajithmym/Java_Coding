package Cool;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Welcome");

        System.out.println("\t Sun Details...");
        Sun j = new Sun();
        j.birth();
        j.speak();
        j.home();
        j.phone();

        System.out.println();
        System.out.println("\t Father Details...");
        Father ji = new Father();
        ji.birth();
        ji.speak();
        ji.home();
        ji.phone();


    }
}
