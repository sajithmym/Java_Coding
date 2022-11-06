package Cool;
import java.util.Scanner;

public class cal2 extends cal1{
    Scanner ii = new Scanner(System.in);
    public cal2(int q,int o){
        System.out.println("Num1 : "+q+"  Num2 : "+o);
        num1 = q;
        num2 = o;
    }

    public cal2(){

    }

    public void mul(){
        System.out.println("\n Multiplication is "+num1+'x'+num2+" = "+(num1*num2));
    }

    public void div(){
        try{
            System.out.println("\n Div is "+num1+'/'+num2+" = "+((float)num1/num2));
        }catch (Exception j){
            System.out.println("\n ---> Error Found "+j+" <---");
        }
    }
}
