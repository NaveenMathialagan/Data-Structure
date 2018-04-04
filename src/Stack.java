
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
public class Stack {
 int stack[];
 int top;
 int size;
    Stack(int size){
      stack=new int[size];
      this.size=size;
      this.top=-1;
    }
    public void push(int data){
        if(top==size-1){
            System.out.println("Stack is full");
        }else{
             stack[++top]=data;
        }
    }
    public void pop(){
        if(top==-1){
          System.out.println("No item is there to pop");
        }else{
        int delete=stack[top];
        top--;
        System.out.println("Deleted Item"+delete);
    }
    }
    public void view(){
        if(top==-1){
           System.out.println("No item is there to view");
        }else{
     for(int i=0;i<=top;i++){
          System.out.print(stack[i]+"\t");
     }}
    }
    public void increase(){
        int[] newstk=new int[size*2];
        for(int i=0;i<=top;i++){
            newstk[i]=stack[i];
        }
        stack=newstk;
        size=size*2;
    }
    public static void main(String arg[]){
        int ch;
        int data;
        Stack stk=new Stack(3);
        Scanner s=new Scanner(System.in);
        while(true){
        System.out.println("1.Push,2.Pop,3.View,4.IncreaseSize");
        ch=s.nextInt();
        switch(ch){
            case 1:System.out.println("Enter the data to be push");
                   data=s.nextInt();
                   stk.push(data);
                   break;
            case 2:stk.pop();
                   break;
            case 3:stk.view();
                   break;
            case 4:stk.increase();
                   break;
             
            
        }
      
         }
     

    }   
}
