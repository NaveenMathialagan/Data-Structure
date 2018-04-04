
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
public class GreedyAlg {
    public static void main(String... args){
        int[] coins={1,2,5,10,20,50,100,500,1000};
        int n;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the values");
        n=s1.nextInt();
        int hundred=0,fifty=0,twenty=0,ten=0,five=0,two=0,one=0;
        while(n>0){
          if(n>=100){
              n=n-100;
              hundred++;
          }else if(n>=50){
               n=n-50;
               fifty++;
          }else if(n>=20){
              n=n-20;
              twenty++;
          }else if(n>=10){
               n=n-10;
               ten++;
          }else if(n>=5){
                n=n-5;
                five++;
          }else if(n>=2){
                n=n-2;
                two++;
          }else if(n>=1){
                n=n-1;
                one++;
          }
        }
        System.out.println();
        String s=((hundred>0)? hundred+" Hundreds,":"")+((fifty>0)?fifty+" fiftys,":"")+((twenty>0)?twenty+" twentys,":"")+((ten>0)?ten+" tens,":"")+((five>0)?five+" fives,":"")+((two>0)?two+" twos,":"")+((one>0)?one+" ones":"");
        /* while(n>0){
            
        }*/
        System.out.println(s);
        
    }
}
