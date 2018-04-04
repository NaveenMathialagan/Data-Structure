/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen Kumar
 */
public class StockSpanProb {
    public static void main(String args[]){
        int a[]= {100, 80, 60, 70, 60, 75, 85};
        int[] s=new int[a.length];
        int j=0,tmp=0;
        for(int i=0;i<a.length;i++){
            if(i==0){
               s[i]=1;
            }else{
               s[i]=1;
               j=0;
               while(j<i){
                   if(a[j]<a[i]){
                       s[i]=s[i]+1;
                   }
                   j++;
               }
            }
        }
        for(int i=0;i<a.length;i++){
          System.out.print(s[i]+" ");
        }
    }
}
