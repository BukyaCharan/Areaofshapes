
package cseA;
import java.util.Scanner;

abstract class Shape
{
	public int x,y;
	public abstract void printArea();
}
class Rectangle extends Shape
{
	public void printArea()
	{
		float area;
		area=x*y;
		System.out.println("Area of Rectangle is"+area);
	}
}
 class Triangle extends Shape
{
	public void printArea()
	{
		float area;
		area=(x*y)/2.0f; 
		System.out.println("Area of Triangle is"+area);
	
	}
}
 class Circle extends Shape
{
	public void printArea()
	{
		float area;
		area=(22*x*y)/7.0f; 
		System.out.println("Area of Circle is"+area);
	
	}
}

public class AreaOfShape
{    
	public static void main(String[] args)
	{
		int choice;
		Scanner ac=new Scanner(System.in);
		System.out.println("Menu\n 1. Area of Rectangle\n 2.Area of Triangle\n 3.Area of Circle\n");
		System.out.println("enter your choice :");
		choice=ac.nextInt();
		switch (choice)
		{
		
		case 1:System.out.println("enter length and breath for area of rectangle:");
		Rectangle r= new Rectangle();
		r.x=ac.nextInt();
		r.y=ac.nextInt();
		r.printArea();
		break;
		
		case 2:System.out.println("enter breath and height for area of triangle:");
		Triangle t= new Triangle();
		t.x=ac.nextInt();
		t.y=ac.nextInt();
		t.printArea();
		break;
		
		case 3:System.out.println("enter area of circle:");
		Circle c= new Circle();
		c.x=ac.nextInt();
		c.y=ac.nextInt();
		c.printArea();
		break;
		
		default:System.out.println("enter correct choice");
			
		}
		
	}

}
