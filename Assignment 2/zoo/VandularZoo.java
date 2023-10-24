
package zoo;
import org.animals.*;
public class VandularZoo {
    public static void main(String [] args){

        Lion l1 = new Lion("Golden Brown", 200 , 10);
        Tiger t1 = new Tiger("Orange with Stripes" , 150 , 5);
        Giraffe g1 = new Giraffe("Yellow",90,12);

        System.out.println("lion characteristics:");
        l1.sound();
        System.out.println("Lion is Vegetarian ? :"+l1.isVeg());

        System.out.println("tiger characteristics:");
        t1.sound();
        System.out.println("Tiger is Vegetarian ? :"+t1.isVeg());

        System.out.println("Giraffe characteristics:");
        g1.sound();
        System.out.println("Giraffe is Vegetarian ? :"+g1.isVeg());

    }
}
