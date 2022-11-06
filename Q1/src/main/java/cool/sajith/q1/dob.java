/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cool.sajith.q1;

import java.util.Scanner;

/**
 *
 * @author Mohamed sajith
 */
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
