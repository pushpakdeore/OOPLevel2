package pushpak16L2MethodsOverloading;
/*ava Program to Show the Nesting of Methods
   Explanation: Enter length, breadth and height as input. After that we first
    call the volume method. From the volume method we call the area method and from the area method we call
    perimeter method. Hence we get the perimeter, area and volume of the cuboid as output.
*/
public class   Cuboid {
    double length,breadth,heigth;

    Cuboid(double length,double breadth,double heigth){
        this.length =length;
        this.breadth=breadth;
        this.heigth=heigth;
    }

    double perimeter(){
        return  2*(length*breadth);
    }

    double area(){
        double perimeter =perimeter();
        System.out.println("perimeter :"+perimeter);
        return length*breadth*heigth;
    }

    double volume(){
        double area =area();
        System.out.println("area :"+ area);
        return length*breadth*heigth;
    }

    public static void main(String[] args) {
        Cuboid c =new Cuboid(12,23,32);
        double volume =c.volume();
        System.out.println("volume : "+volume);
    }
}
