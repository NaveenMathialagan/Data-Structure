
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen Kumar
 */
public class LinearSearch {
    LinearSearch(){
      
    }
    public static void main(String arg[]){
         int[] a={1,2,3,4,5,6};
         int flag=0;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the Element to be search");
         int ser=s.nextInt();        
         for(int i=0;i<a.length;i++){
             if(a[i]==ser){
                 flag=1;
                 break;
             }
         }
         if(flag==1){
           System.out.println("Element found");
         }else{
            System.out.println("Element not found");
         }  
    }
}
