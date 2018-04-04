
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
public class rversell {
    
    public static int rec(int n){
       if(n==1){
          return 0;
       }
        int s=rec(n-1);
        System.out.println("asdads"+s);
        return s;
    }
    public static void main(String args[]){
      int a=5;
      System.out.println("fdsfs"+rec(a));
      String[] s=new String[4];
      s[0]="2";
      s[1]="2";
      s[2]="2";
      s[3]="2";
      System.out.println(Arrays.toString(s).replaceAll("\\[",""));
      
    }
    
}
