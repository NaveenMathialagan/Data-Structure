
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen Kumar
 */
public class Bubblesort {
    public static void main(String arg[]){
       int[] a={22,1,55,3,4};
       int temp;
       for(int i=0;i<a.length-1;i++){
         for(int j=0;j<a.length-1;j++){
             if(a[j]>a[j+1]){
                 //System.out.println(a[i]+","+a[j]);
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
             }
         }
       }
        for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
         }
      String str="12,2,33,4,44,55";
      String[] arr=str.split(",");
      Arrays.sort(arr);
      for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
      }
    }
}
