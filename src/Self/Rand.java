package Self;

import java.util.ArrayList;
import java.util.Scanner;

public class Rand {
    private String name;
    private int phone;
    
    static ArrayList<Object> phoneDic = new ArrayList<>();
    
    Rand(String name, int phone){
        this.name = name;
        this.phone = phone;
    }
    public ArrayList<Object>  addUser(){
        phoneDic.add(this.name);
        phoneDic.add(this.phone);
        return phoneDic;
    }
    public void check(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter name of the user:");
        this.name = scan.nextLine();
        
        for(int i = 0; i < phoneDic.size(); i++){
            if(phoneDic.get(i).equals(this.name)){
                System.out.println("Username: " + phoneDic.get(i) + " with phone number: "+ phoneDic.get(i+1));
                
            }
        }
        if(!phoneDic.contains(this.name)){
            System.out.println("-1");
        }
        
    }
    public static void main(String[] args){
        Rand obj = new Rand("me", 782345);
        Rand obj2 = new Rand("Akama", 224433);
        Rand obj3 = new Rand("he", 234556);
        obj3.addUser();
        obj.addUser();
        obj2.addUser();
        obj.check();
        
        
    }
    
    
}
