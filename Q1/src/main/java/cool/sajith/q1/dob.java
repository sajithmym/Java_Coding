package cool.sajith.q1;

import java.util.Scanner;

public class dob {
    int y,m,d;
    Scanner e = new Scanner(System.in);
    void set(){
        System.out.print("\n  Enter Your Birth day...");
        System.out.print("\n  \tYear : ");
        y = e.nextInt();
        
        System.out.print("  \tMonth : ");
        m = e.nextInt();
        
        System.out.print("  \tDay : ");
        d = e.nextInt();
    }
    
    String gt(){
        String bd =  String.valueOf(y)+"/"+String.valueOf(m)+"/"+String.valueOf(d);
        return bd;
    }
}
