package org.example;

public class people {
    void action(){
        System.out.println("woshiren ");
    }
}
class teacher extends people{
    void teach(){
        System.out.println("teacher is teaching");
    }
    void action(){
        System.out.println("woshilaoshi");
    }
}