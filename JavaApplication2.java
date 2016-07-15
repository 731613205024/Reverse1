/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
 
String b = new StringBuffer(a).reverse().toString();
System.out.println("The reverse String is "+b);
    }
}

    
