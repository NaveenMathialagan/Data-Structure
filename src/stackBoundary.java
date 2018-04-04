
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
public class stackBoundary<T> {
 
    int top=-1;
    T[] stack;
    T data;
    public stackBoundary() {
       this.stack=(T[]) new Object[3];
    }
    
    public void push(T data){
         stack[++top]=data;
         this.data=data;
    }
    public void pop(){
    
    
    }
    public void view(){
          for(int i=0;i<=top;i++){
             System.out.print(stack[i]+"\t");
          }
           System.out.print(data);
           System.out.print("\n");
          
    }
    public static void main(String arg[]){
        stackBoundary sb=new stackBoundary();    
        sb.push(34);
      //  stackBoundary<String> sb1=new stackBoundary<String>();
        sb.push("Naveen");
        sb.push(true);
        sb.view();
 
   }   
}
