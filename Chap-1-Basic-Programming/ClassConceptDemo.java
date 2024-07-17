import java.util.Scanner;

public class ClassConceptDemo {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        Box b2 = new Box(5, 10, 15);

        System.out.println("Volume of b1: " + b1.getVolume());
        System.out.println("Volume of b2: " + b2.getVolume());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, breadth and height of b1: ");
        b1.setLength(sc.nextInt());
        b1.setBreadth(sc.nextInt());
        b1.setHeight(sc.nextInt());

        System.out.println("Volume of b1: " + b1.getVolume());
        sc.close();
    }
}

class Box{
    private int length;
    private int breadth;
    private int height;

    //default constructor: this constructor is automatically inserted by JVM if no constructor is defined
    public Box(){
       this.length = this.breadth = this.height = 0;
    }

    //parameterized constructor
    public Box(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }

    public int getVolume(){
        return length * breadth * height;
    }

    public void setLength(int l){
        length = l;
    }

    public void setBreadth(int b){
        breadth = b;
    }

    public void setHeight(int h){
        height = h;
    }

}