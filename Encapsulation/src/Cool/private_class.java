package Cool;

import java.util.Scanner;

public class private_class {
    Scanner i = new Scanner(System.in);
    private int no;
    private String name;
    private double basic;

    public void setting(){
        System.out.print("Enter Id : ");
        no = i.nextInt();
        System.out.print("Enter Name : ");
        name = i.next();
        System.out.print("Enter Basic : ");
        basic = i.nextDouble();
    }

    public void Show(){
        System.out.println("\n\n-------> Id : "+no);
        System.out.println("-------> Name : "+name);
        System.out.println("-------> Basic : "+basic);
    }
}
