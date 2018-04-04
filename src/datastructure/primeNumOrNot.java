/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructure;

import java.util.Scanner;

/**
 *
 * @author Naveen Kumar
 */
public class primeNumOrNot {
    
    public static void main(String args[]){
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the Nummber");
     int n=s.nextInt();
     int n1=(int) Math.sqrt(n);
     System.out.println("Sqrt: "+n1);
     int flag=0;
     for(int i=2;i<=n1;i++){
         if(n%i==0){
             flag=1;
             break;
         }
     }
     if(flag==0){
         System.out.println("Given number is prime number");
     }else{
         System.out.println("Given number is not prime number");
     }
     
    }   

}
