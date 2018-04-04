/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen Kumar
 */
public class listex {
    String Name;
    int Age;
    public listex(String name,int age){
        this.Name=name;
        this.Age=age;
    }

    listex() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setName(String Name){
       this.Name=Name;
    }
    public String getName(){
     return this.Name;
    }
    public void setAge(int age){
        this.Age=age;
    }
    public int getAge(){
        return this.Age;
    }
}
