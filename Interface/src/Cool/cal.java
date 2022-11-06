package Cool;

import java.util.Scanner;

public class cal implements math
{
    int num1,num2;
    cal(){
        Scanner ss = new Scanner(System.in);
        System.out.print("Number 1 : ");
        num1 = ss.nextInt();
        System.out.print("Number 2 : ");
        num2 = ss.nextInt();
    }
    @Override
    public void add() {
//        inp();
        System.out.println("\t Addition is "+(num1+num2));
    }

    @Override
    public void sub() {
//        inp();
        System.out.println("\t Subtraction is "+(num1-num2));
    }

    @Override
    public void mul() {
//        inp();
        System.out.println("\t Multiplication is "+(num1*num2));
    }

    @Override
    public void div() {
        try {
            System.out.println("\t Divition is " +  ((double)num1 / num2));
        } catch (Exception v) {
            System.out.println("Divition Error");
        }
    }
}
