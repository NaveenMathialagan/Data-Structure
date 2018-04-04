
import java.util.Scanner;


public class Queue {
    
    int[] queue;
    int front=0;
    int rear=-1;
    int size;
  public Queue(int size){
      this.queue=new int[size];
      this.size=size;
  }
    public void enqueue(int data){
         if(rear==size-1){
            System.out.println("Queue is full");
         }else{
              queue[++rear]=data;
         }
   
     }
    public void dequeue(){        
        if(front==0 && rear==-1){
            System.out.println("Queue is Empty");
        }else if(front>rear){
             front=0;
             rear=-1;
             System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Element Deleted "+queue[front]);
             front=front+1;                    
        }
         
   
   }
    public void view(){
        if(front==0&& rear==-1){
            System.out.println("Queue is Empty");
        }else{
         for(int i=front;i<=rear;i++){
             System.out.print(queue[i]+"\t");
           
         }
           System.out.println("\n");
    }
    }
    public void peek(){
        if(front==0&&rear==-1){
            System.out.println("Queue is Empty");
        }else{
    System.out.println("Peek element is"+queue[front]);
    }
    
    }
    
    public static void main(String args[]){
      int ch;
      int data;
      Queue q=new Queue(4);
               Scanner s=new Scanner(System.in);
        while(true){
        System.out.println("1.Enqueue,2.Dequeue,3.View,4.peek");
        ch=s.nextInt();
        if(ch==5){
          break;
        }else{
        switch(ch){
            case 1:System.out.println("Enter the data to be enqueue");
                   data=s.nextInt();
                   q.enqueue(data);
                   break;
            case 2:q.dequeue();
                   break;
            case 3:q.view();
                   break;
            case 4:q.peek();
        }
              
        }
 
  }}
}   

