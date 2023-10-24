import java.util.Scanner;

public class Ques10 {
    public double area(double side){
        return side*side;}

    public double area(double len,double bre) {
    return len*bre;
    }
    public double peri(double side){
        return 4*side;}

    public double peri(double len,double bre){
        return 2*(len+bre);
    }

    public static void main(String[] args) {

        Ques10 n = new Ques10();
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        System.out.println("Enter SIDE");

        double area = n.area(side);
        double peri = n.peri(side);

        System.out.println("FOR SQUARE Area :" + area +"Peri:"+peri);

        System.out.println("Enter Len & Wid");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        double a = n.area(n1,n2);
        double p = n.peri(n1,n2);
        System.out.println("FOR RECTANGLE Area :" + a +"Peri:"+p);

        }
    }

