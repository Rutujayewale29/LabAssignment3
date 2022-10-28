package practice;
public class Shape 
{ 
	
	void Area()
	{
		System.out.print("Shape:-");
	}
}
class Circle extends Shape   //inherited from Shape class
{
 void areaOfCircle()
 {
	 double pi1=3.14;
	 int r1=8;
	 double a=pi1*r1*r1;  //calculate area of circle
	 System.out.print("Area of circle is:-"+a);
 }
}
class Square extends Shape    //inherited from Shape class
{
  void areaOfSquare()
  {
	  int a1=5;
	  int b=a1*a1;   //calculate area of square
	  System.out.print("Area of Square is:- "+b);
  }
  public static void main(String...args)
  {
	  Circle c=new Circle();
	  c.areaOfCircle();//call method
	  Square s=new Square();
	  s.areaOfSquare();//call method
	 
  }
 }

 
