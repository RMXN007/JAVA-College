package GG.RamanJava;


import java.util.Scanner;
class Employe{
    private int id;
    private String name;

    public void setID(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }

    Employe(){
        this.id=0;
        this.name="Your_Name";
    }
    Employe(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class constructor {
    public static void main(String[] args) {
        Employe rama= new Employe();
        rama.setID(2);
        rama.setName("raman");
        System.out.println(rama.getID());
        System.out.println(rama.getName());
        
        Employe Raman=new Employe();
        System.out.println(Raman.getID());
        System.out.println(Raman.getName());
    }
}
