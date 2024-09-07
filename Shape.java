package pushpak16L2MethodsOverloading;

public class Shape {
    public void  area(double length){
        double Square =length*length;
        System.out.println("Area of Square is :"+Square);
    }
    public  void area(double length,double width){
        double Rectangle  = length*width;
        System.out.println("Area if Reactangle :"+Rectangle);
    }
    public  void area(double redius,boolean isCircle){
        double circle =3.14*redius*redius;
        System.out.println("area of circle is :"+circle);
    }

    public static void main(String[] args) {
        Shape s =new Shape();
        s.area(3,3);
        s.area(3);
        s.area(3,true);
    }

}
