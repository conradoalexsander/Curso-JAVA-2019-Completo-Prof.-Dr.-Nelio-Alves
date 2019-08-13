package Entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double Area() {
		
		return width*height;
	}
	
	public double Perimeter() {
		return (2*height + 2* width);
	}

	public double Diagonal() {
		return Math.sqrt((height*height) + (width*width));
	}
	
	public String toString() {
		return "Area= "+ String.format("%.2f", Area())
				+"\n"
				+"Perimeter= " + String.format("%.2f", Perimeter())
				+"\n"
				+"Diagonal= "+ String.format("%.2f", Diagonal());
				
	}
}
