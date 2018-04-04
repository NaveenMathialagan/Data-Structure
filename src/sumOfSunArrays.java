/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen Kumar
 */
public class sumOfSunArrays {
    public static void main(String args[]){
        int a[]= {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k=4;
        int max=0;
        for(int i=0;i<=a.length-k;i++){
            max=a[i];
            for(int j=i+1;j<(i+k);j++){
                if(a[j]>max){
                max=a[j];
                }
            }
            System.out.print(max+" ");
        }
        
    }
}
