/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Aravind
 */
public class Aravi {
     public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Enter  the no.1:");
         Scanner s1=new Scanner(System.in);
         int a=s1.nextInt();
         System.out.println("Enter the no.2:");
         int b=s1.nextInt();
         if(a==1||b==1){
             System.out.println(1);
         }
         else if(a<0&&b<0){
             System.out.println(0);
     }
               
     }
}
