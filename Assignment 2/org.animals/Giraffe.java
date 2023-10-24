package org.animals;

public class Giraffe {
    String color;
    double weight;
    int age;

    public Giraffe(String color,double weight,int age)
    {
        this.color=color;
        this.weight=weight;
        this.age=age;
    }
    public void sound() {
        System.out.println("Giraffe Hums");
    }
        public boolean isVeg() {return true;}
    }


