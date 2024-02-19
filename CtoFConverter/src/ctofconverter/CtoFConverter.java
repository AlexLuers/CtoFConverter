/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ctofconverter;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class CtoFConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       double farenhiet;
       double celsius = 0;
       boolean done = false;       
       do
       {
           System.out.println("What is the temperature in Celcius?");
           farenhiet = in.nextDouble();
           if (in.hasNextDouble())
           {
               if ((farenhiet) == 0)
               {
                   System.out.println("That is the freezing point of water!");
               }
               else if ((farenhiet) == 100)
               {
                   System.out.println("That is the boiling point of water");
               }
               farenhiet = celsius * 1.8;
               farenhiet = farenhiet + 32;
               System.out.println("The temperature in Farenhiet is: " + farenhiet);
           }
           else
           {
               System.out.println("That is not a valid input: " + celsius);
           }
       }while (!done);
      
    }
    
}
