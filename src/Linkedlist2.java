/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen Kumar
 */
public class Linkedlist2 {
    
    Node head=null;
    Node tail=null;
    public void add(int value){
        Node nd=new Node();
        nd.setValue(value);
        System.out.println("Value added\t"+value);
        if(head==null && tail==null){
             head=nd;
             tail=nd;
        }else{
             tail.setrefNode(nd);
             tail=nd;
        }
    }
    public void addFront(int ele){
       Node nd=new Node();
       nd.setValue(ele);
       nd.setrefNode(head);
       head=nd;
       System.out.println("Added Front"+ele);
        
    }
    public void addAfter(int ele,int after){
        Node tmp=head;
        Node ref=null;
        while(true){
            if(tmp==null){
              break;
            }
             if(tmp.getValue()==after){
                 ref=tmp;
                 break;
             }
             tmp=tmp.getrefNode();
        }
        if(ref!=null){
            Node nd=new Node();
            nd.setValue(ele);
            nd.setrefNode(ref.getrefNode());
            tmp.setrefNode(nd);
            System.out.println("Added After"+ele);
        }
        
        
    }
    public void delete(){
       if(head!=null){
        System.out.println("Deleted\t"+head.getValue());
       head=head.getrefNode();
       } 
       
        
    }
    public void deleteAfter(int ele){
          Node tmp=head;
          Node ref=null;
          while(true){
            if(tmp==null){
               break;
            }
            if(tmp.getValue()==ele){
                ref=tmp;
                break;
            }
            tmp=tmp.getrefNode();
          }
          if(ref!=null){
              tmp=ref.getrefNode();
              ref.setrefNode(tmp.getrefNode());
              if(ref.getrefNode()==null){
                ref=tail;
              }
                System.out.println("Deleted after the element"+tmp.getValue());
          
          }
       
    }
    public void view(){
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.getValue()+"\t");
            tmp=tmp.getrefNode();
        }
        System.out.println("\n");
    }
    public static void main(String arg[]){
        Linkedlist2 l=new Linkedlist2();
        l.add(55);
        l.add(56);
         l.add(7);
         l.add(8);
        l.addFront(1);
        l.addAfter(2,1);
        l.view();
        l.delete();
        l.view();
        l.deleteAfter(56);
        l.view();
        
    }
    public class Node{
        int value;
        Node refNode;
        public void setrefNode(Node nd){
             this.refNode=nd;
        }
        public Node getrefNode(){
           
             return refNode;
        }
        public void setValue(int value){
             this.value=value;
        }
        public int getValue(){
            return value;
        }
    }
}
