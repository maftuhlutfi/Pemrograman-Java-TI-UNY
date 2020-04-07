/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

class Rectangle {
	double height = 1;
	double width = 1;

	Rectangle() {
		
	}

	Rectangle(double w, double h) {
		height = h;
		width = w;
	}

	double getArea() {
		return height * width;
	}

	double getPerimeter() {
		return 2 * (height + width);
	}
}

public class soal_9_1 {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);

		System.out.println("------------");
		System.out.println("Rectangle 1");
		System.out.println("------------");
		System.out.printf("Width = %.2f %n", rect1.width);
		System.out.printf("Height = %.2f %n", rect1.height);
		System.out.printf("Area = %.2f %n", rect1.getArea());
		System.out.printf("Perimeter = %.2f %n", rect1.getPerimeter());

		System.out.println(" ");

		System.out.println("------------");
		System.out.println("Rectangle 2");
		System.out.println("------------");
		System.out.printf("Width = %.2f %n", rect2.width);
		System.out.printf("Height = %.2f %n", rect2.height);
		System.out.printf("Area = %.2f %n", rect2.getArea());
		System.out.printf("Perimeter = %.2f %n", rect2.getPerimeter());
	}
}

/*

======
OUTPUT
======
------------
Rectangle 1
------------
Width = 4.00 
Height = 40.00 
Area = 160.00 
Perimeter = 88.00 

------------
Rectangle 2
------------
Width = 3.50 
Height = 35.90 
Area = 125.65 
Perimeter = 78.80

*/