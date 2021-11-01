/*Inheritance and Polymorphism:
Write a program to create a class named shape. In this class we have three
sub classes Circle, Triangle and Square each class has two member function
named area () and draw (). Create these using polymorphism concepts.

area() --> Calculate the area of shape
draw () --> Drawing a shape [name] with coordinates [] */


package SessionTask;

public class Polymorpism4 {

public static void main(String[] args) {
		
		Shape shape = new Shape();
		
		Triangle tri  = new Triangle();
		Cirle cir = new Cirle();
		Rectangle rect = new Rectangle();
		tri.Area(4,6);
		cir.Area(3);
		rect.Area(4, 3);

	}

}

class Shape{
	
	int r;
	int h;
	int b;
	int l;
	
	
}
		
		class Triangle extends Shape{
			
			void Area(int b ,int h) {
				System.out.println("area of triangle is :"+(0.5*b*h));
				
			}
			void draw() {
				
			}
		}
		
		class Cirle extends Shape{
			
			void Area(int r) {
				System.out.println("area of circle is : " +(3.14*r*r));
			}
		}
		
		class Rectangle extends Shape{
			
			void Area(int l , int b) {
				System.out.println("area of circle is : " +(l*b));
			}
		}


