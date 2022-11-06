package Cool;
import java.util.Scanner;

public class cal3 extends cal2{
    Scanner ii = new Scanner(System.in);
    public void other(){
        System.out.println("Power is "+num1+" ^ "+num2+" = "+Math.pow(num1,num2));
        System.out.println("Square Root of "+num2+" = "+Math.sqrt(num2));
    }

    public cal3(int a,int y){
//        System.out.print("Enter Number 1 : ");
//        int q = ii.nextInt();
//        System.out.print("Enter Number 2 : ");
//        int p = ii.nextInt();
        super(a,y);
    }
}
