package org.animals;

public class Lion {
    String color;
    double weight;
    int age;

    public Lion(String color,double weight,int age)
    {
        this.color=color;
        this.weight=weight;
        this.age=age;
    }
    public void sound() {
        System.out.println("Lion Roars");
    }
        public boolean isVeg() {return false;}
    }

