
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamed sajith
 */
public class mem{
    ArrayList<data> i = new ArrayList<>();
    
    void w(){
        for (int c=0; c!= i.size(); ++c){
            System.out.println(i.get(c).id+" <-->  "+i.get(c).name);
        }
    }

}
