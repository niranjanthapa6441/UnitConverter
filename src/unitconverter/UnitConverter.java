/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitconverter;

import java.util.Scanner;

/**
 *
 * @author niran
 */
public class UnitConverter {
    Scanner sc=new Scanner(System.in);
    public void loop(){
        System.out.println("Input Enter your Name:");
        String name=sc.nextLine();
        System.out.println("Name: "+name);
        System.out.println("Do you want to continue(Y/N):");
        String checker=sc.nextLine();
        if("y".equals(checker.toLowerCase())){
            loop();
        }
        else{
            System.out.println("Thank You");
        }
         }
    public static void main(String[] args) {
        UnitConverter uc= new UnitConverter();
        uc.loop();
    }
    
}
