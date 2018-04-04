/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen Kumar
 */
public class Recursion {
  
    static int a[]={1,2,3,4};
    static int ans=1;
    Recursion(){
        
    }
    static void stackRev(int n){
        if(n<0)
        {
          return;
        }else{
           stackRev(n-1);
           System.out.println(a[n]);
        }             
    }
    
    public static void main(String arg[]){
         stackRev(4);
    }
}
