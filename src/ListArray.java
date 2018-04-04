
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListArray {
    
    public static void main(String arg[]){
        String name;
                int age;
                int ch;
              
         List<listex> ls=new ArrayList<listex>();
         Scanner s=new Scanner(System.in);
         while(true){
             System.out.println("1.AddElement,2.View Element,3.Search ELement,4.Exit");
             ch=s.nextInt();
               
             if(ch==1){
                 listex l=new listex();
                  System.out.println("Enter the name and age of the person");
                name=s.next();
                age=s.nextInt();
                l.setAge(age);
                l.setName(name);
                ls.add(l);
             }else if(ch==2){
                for(listex le:ls) {
                     System.out.println(le.getName()+"\t"+le.getAge());
                }
             }else if(ch==3){
                 System.out.println("Enter the age to search");
                 int a=s.nextInt();
                  for(listex le:ls) {
                      if(le.getAge()==a){
                         System.out.println(le.getName());
                      }
                      
                  }
             }
             else if(ch==4){
                 System.out.println("Enter the age to remove");    
                 int a=s.nextInt();
                 for(listex le:ls) {
                      if(le.getAge()==a){
                            ls.remove(0);                 
                      }
                      
                  }
             
             }
             else{
                 break;
             }
         }
    }
}
