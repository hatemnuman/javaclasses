package com.class17;

public class DogClass {
	
	String name,color,type,breed;
    
    void bark() {
        System.out.print(type+" can bark");
    }
     void run() {
        System.out.println(type+"can run");
    }
     void play() {
        System.out.println(type+"can play");
    }
    public static void main(String[] args) {
      
        DogClass dog1=new DogClass();
        dog1.type="Husky";
        dog1.bark();
        DogClass dog2=new DogClass();
        dog2.type="Bulldog";
        DogClass dog3=new DogClass();
        dog3.type="Labrador";
        
    }
 }


