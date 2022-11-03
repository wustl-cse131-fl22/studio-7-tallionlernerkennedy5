package studio7;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;

	public Rectangle (double l, double w)
	{
		length = l;
		width = w;
		area = l*w;
		perimeter = 2*l+2*w;
	}
	public void print()
	{
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return length*width;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return 2*length + 2*width;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	public boolean isBigger(Rectangle r2)
	{
		
		
		if (Math.max(this.getArea(), r2.getArea()) == this.getArea())
		{
			return true;
		}
		else
		{
			return false;
		}	
	}

	public boolean isSquare (double length, double width)
	{
		if (length == width)
		{
			return true;
		}
		else
		{
			return false;
		}
	}




 
	public static void main(String[]args)
	{
		Rectangle r1 = new Rectangle(18, 20.5);
		Rectangle r2 = new Rectangle (8, 4);
		if (r1.isBigger(r2) == true ) {
			System.out.println("r1 is bigger than r2 ");
		}
		else {
			System.out.println("r2 is bigger than r1 ");
		}
		System.out.println("Area r1: "+ r1.area);
		System.out.println("Area r2: "+ r2.area);
		System.out.println("Perimiter r1: "+ r1.perimeter);
		System.out.println("Perimiter r2: "+ r2.perimeter);
		
	}
}
