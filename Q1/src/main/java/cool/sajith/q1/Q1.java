/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cool.sajith.q1;

import java.util.ArrayList;
import java.util.Scanner; 

/**
 *
 * @author Mohamed sajith
 */
public class Q1 {

    public static void main(String[] args) {
        int check;
        ArrayList<store> data = new ArrayList<>();
        Scanner f = new Scanner(System.in);
        int count = 0;
        for (int i=0; i!=1000; ++i){
            store s = new store();
            s.add();
            data.add(s);
            
            System.out.print("\n \t\t --> Enter -1 to Stop.... \n \t\t --> Enter any key to continue.\n\t\t    Enter : ");
            check = f.nextInt();
            count++;
            
            if (check == -1)
                break;
        }
        
        for (int q=0; q!=count;q++)
            System.out.print(data.get(q));
    }
}
