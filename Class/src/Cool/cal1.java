package Cool;
import java.util.Scanner;

public class cal1 {
    int num1,num2;
    Scanner ii = new Scanner(System.in);
    cal1(int a,int b){
        num1 = a;
        num2 = b;
    }

    cal1(){
//        System.out.print("Enter Number 1 : ");
//        int q = ii.nextInt();
//        System.out.print("Enter Number 2 : ");
//        int p = ii.nextInt();
//        num1 = q;
//        num2 = p;
    }

    public void add(){
        System.out.println("\n Addition is "+num1+'+'+num2+" = "+(num2+num1));
    }

    public void add(int a,int b){
        System.out.println("\n Addition is "+a+'+'+b+" = "+(a+b));
    }

    public void sub(int a,int b){
        System.out.println("\n Subtraction is "+a+'-'+b+" = "+(a-b));
    }

    public void sub(){
        System.out.println("\n Subtraction is "+num1+'-'+num2+" = "+(num1-num2));
    }
}
