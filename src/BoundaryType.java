/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen Kumar
 */
public class BoundaryType {
   /* T t;
    public void set(T t)
    {
        this.t=t;
    }
    public T get(){
         return t;
    }*/
    public <T> void count(T[] anArray, T elem) {
    int count = 0;
    for (T e : anArray)
    {
       if(e.equals(elem)){
            count++;
       }
    }
    if(count!=0){
       System.out.println("Element matched");
    }else{
        System.out.println("Element not found");
    }
    
}
    public static void main(String arg[]){
          BoundaryType bt=new BoundaryType();
          /*BoundaryType<String> bt1=new BoundaryType<String>();
          bt.set(2);
          System.out.println(bt.get());
          bt.set(5);
          System.out.println(bt.get());
          bt1.set("ssdfskldf");
          System.out.println(bt1.get()); */
          bt.count(new Integer[]{1,2,3},2);
          bt.count(new String[]{"aa","bb","cc"},"c");
          
          //  new Genric<Integer[]>(new Integer[]{1,2});
       
    }
  
}
