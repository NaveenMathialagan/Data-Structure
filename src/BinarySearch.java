
import java.util.Scanner;
public class BinarySearch {
    public static void main(String args[]){
       int[] a={1,2,3,4,5,6};
       int flag=0,search,top=a.length-1,bottom=0,mid;  
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the element to be search");
       search=s.nextInt();
       while(top>=bottom&&flag==0){
          mid=(top+bottom)/2;
          if(a[mid]==search){
              flag=1;
              break;
          }else if(a[mid]<search){
              bottom=mid+1;
          }else{
              top=mid-1;
          } 
           
       }
       if(flag==1){
          System.out.println("Element found");
       }else{
          System.out.println("Element not found");
       }
    }
}
