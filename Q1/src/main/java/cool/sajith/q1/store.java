package cool.sajith.q1;

import java.util.Scanner;
public class store {
    Scanner ip = new Scanner(System.in);
    int id;
    String Name, City,birth;
    dob w = new dob();
    void add(){
        System.out.print("\nEnter id : ");
        id = ip.nextInt();
        
        System.out.print(" Enter Name  : ");
        Name = ip.next();
        
        w.set();
        
        System.out.print(" Enter City  : ");
        City  = ip.next();
    }

    @Override
    public String toString(){
        return "\nStudent {Sdudent id = "+String.valueOf(id)+", Name = "+Name+", DOB = "+w.gt()+", City = "+City+"}";
    }
}
