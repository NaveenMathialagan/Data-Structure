
public class Linkedlist<T> {
    Node<T> head=null;
    Node<T> tail=null;
    T value;
    public void add(T ele){
        Node<T> nd=new Node<T>();
        nd.setValue(ele);
        System.out.println("Added\t"+ele);
      if(head==null && tail==null){
           head=nd;
           tail=nd;
      }else{
           tail.setNextref(nd);
           tail=nd;
          
      }
    }
    public void addafter(T ele,T after){
         Node<T> tmp=head;
         Node<T> ref=null;
         while(true){
            if(tmp==null){
               break;
            }else{
               if(tmp.getValue()==after){
                  ref=tmp;
                  break;
               }      
            }
            tmp=tmp.getNextref();
         }
         if(ref!=null){
            Node<T> nd=new Node<T>();
            nd.setValue(ele);
            ref=tmp.getNextref();
            nd.setNextref(ref);
            tmp.setNextref(nd);
            if(tail==tmp){
               tail=nd;
            }
            System.out.println("After element added"+ele);
         }else{
             System.out.println("Unable to find the reference element");
         }
    
    }
    public void delete(){
         
       if(head==null){
          System.out.println("No node exist to delete");
       }else{
         Node<T> nd=head;
         head=nd.getNextref();
         if(head==null){
             tail=null;
         }
         System.out.println("Front node is deleted"+nd.getValue());
       }
       view();
    }
    public void deleteAfter(T ele){
        Node<T> tmp=head;
        Node<T> ref=null;
        while(true){
           if(tmp==null){
               break;
           }
           else{
              if(tmp.getValue()==ele){
                  ref=tmp;
                  break;
              }
              
           }
          tmp=tmp.getNextref();
        }
        if(ref!=null){
            tmp=ref.getNextref();
            ref.setNextref(tmp.getNextref());
            if(ref.getNextref()==null){
                ref=tail;
            }
            System.out.println("Deleted after the element"+tmp.getValue());
            view();
        }
    }
    public void view(){
        Node<T> nd=head;
        if(nd==null){
            System.out.println("No nodes are exist to view");
        }else{
        while(nd!=null){
            if(nd==tail){
                System.out.print(nd.getValue()+"\t");
                break;
            }
           System.out.print(nd.getValue()+"\t");
           nd=nd.getNextref();
        }
        }
        System.out.println("\n");
    
    }
    public static void main(String arg[]){
        Linkedlist<Integer> ll=new Linkedlist<Integer>();
        ll.add(11);
        ll.add(22);
        ll.add(44);
        ll.addafter(12,11);
        ll.view();
        ll.delete();
        ll.deleteAfter(12);
       
    }
}
class Node<T>{
  private T value;
  private Node<T> nextref;
  public void setValue(T value){
    this.value=value;
  }
  public T getValue(){
     return this.value;
  }
  public void setNextref(Node<T> nd){
      this.nextref=nd;
  }
  public Node<T> getNextref(){
    return this.nextref;
  }
  
}