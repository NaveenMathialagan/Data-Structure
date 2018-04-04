/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen Kumar
 */
public class Recursion2 {
    
    static void rec(String a,int i){
        if(i==a.length()){
            return;
        }
        rec(a,i+1);
        System.out.println(a.charAt(i));
    }
    public static void main(String... args){
        rec("smnnaveen",0);
       
        
    }
}
