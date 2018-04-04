/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen Kumar
 */
public class DoublyLinkedList {
    Node head=null;
    Node tail=null;
    int size;
    public void addFirst(int a){
        Node nd=new Node();
        nd.setValue(a);
        if(head==null && tail==null){
            head=nd;
            tail=nd;
        }else{
             nd.setPrev(null);
             nd.setnext(head);
             head.prev=nd;
             head=nd;
        }
        size++;
        System.out.println("Value added at first"+a);
    }
    public void add(int a){
          Node nd=new Node();
          nd.setValue(a);
          nd.setnext(null);
          if(tail==null && head==null){
               head=nd;
               tail=nd;
          }else if(tail!=null){
          nd.setPrev(tail);
          tail.setnext(nd);
          tail=nd;
          }
          size++;
          System.out.println("Value added at last"+a);
    }
    public void addAfter(int a,int after){
         Node aftr=null;
         Node bfr;
         Node tmp=head;
         while(tmp!=null){
             if(tmp.getValue()==after){
                  aftr=tmp;
                  break;
             }
             tmp=tmp.getnext();
         }
        if(aftr!=null){
              Node nd=new Node();
              nd.setValue(a);
              bfr=aftr.getnext();
              nd.setnext(bfr);
              bfr.setPrev(nd);
              nd.setPrev(aftr);
              aftr.setnext(nd);
              
        }
        System.out.println(a+" added after "+after);
    }
    public void view(){
          Node tmp=head;
          while(tmp!=null){
             System.out.print(tmp.getValue()+"\t");
             tmp=tmp.getnext();
          }
          System.out.println("\n");
    }
    public void delete(){
       Node tmp=head;
       head=tmp.getnext();
       head.setPrev(null);
       System.out.println("Value deleted "+tmp.getValue());
      view();
    }
    public void delete(int a){
        Node tmp=head;
        Node dlt=null;
        while(tmp!=null){
             if(tmp.getValue()==a){
               dlt=tmp;
             }
             tmp=tmp.getnext();
        }
        if(dlt!=null)
        {   
          Node bfr=dlt.getnext();
          Node aftr=dlt.getPrev();
          bfr.setPrev(aftr);
          aftr.setnext(bfr);       
        }
        System.out.println("Value deleted "+dlt.getValue());
        view();
    }
    public static void main(String arg[]){
       DoublyLinkedList dl=new DoublyLinkedList();
            dl.addFirst(50);
            dl.add(20);
            dl.add(30);
            dl.add(40);
            dl.add(70);
            dl.addAfter(10,50);            
            dl.view();
            dl.delete();
           // dl.delete(70);
    }
    
    public class Node{
         Node prev;
         Node next;
         int value;
         public void setPrev(Node n){
             this.prev=n;
         }
         public void setnext(Node n){
           this.next=n;
         }
         public void setValue(int value){
           this.value=value;
         }
         public Node getPrev(){
            return prev;
         }
         public Node getnext(){
            return next;
         }
         public int getValue(){
            return value;
         }
      
    }
}
