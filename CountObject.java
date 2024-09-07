package pushpak16L2MethodsOverloading;
/*2. Java Program to Count Number of Objects Created for Class
   Explanation:Whenever an object is made of a class, its constructor is invoked. Whenever the constructor runs we increment the counter value. Hence
   the number of objects created of a class equals the counter value
 */
public class CountObject {
    int age;
    String name;
    private static int count =0;
    CountObject(int age,String name){
        this.name =name;
        this.age=age;
        count++;
    }
    public static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        CountObject n =new CountObject(23,"pushpak");
        CountObject n1 =new CountObject(23,"pushpak");
        CountObject n3=new CountObject(23,"pushpak");
        System.out.println("Number of object created is :"+CountObject.getCount());

    }

}
