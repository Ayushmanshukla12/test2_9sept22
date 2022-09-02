package test2_9sept22;


 abstract class Shape{

   abstract void display();
}
class Rectangle extends Shape{
     int area;int length=3,breadth=5;
     void calculatearea(){
          area =length*breadth;
     }
     void display(){
         System.out.println("area of rectangle is "+ area);
     }

}
public class Polymorphismtest {
    public static void main(String[] args) {
      Shape shape;
      Rectangle rectangle =new Rectangle();
      shape=new Rectangle();
      rectangle.calculatearea();
      rectangle.display();
    }
}
