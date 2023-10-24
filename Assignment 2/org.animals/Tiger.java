package org.animals;

public class Tiger{
    String color;
    double weight;
    int age;

    public Tiger(String color,double weight,int age)
    {
        this.color=color;
        this.weight=weight;
        this.age=age;
    }
    public void sound(){
        System.out.println("Tiger Roars");}

        public boolean isVeg() {return false;}
    }
