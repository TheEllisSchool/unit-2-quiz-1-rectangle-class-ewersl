
public class Rectangle {
	private double width; 
	private double height; 

	public Rectangle () {
		width= 10; 
		height= 10; 
	}
	public Rectangle (double w, double h) {
		width = w; 
		height= h; 
	}
	public void setWeight(double w) {
		if (w> 0) { 
			width= w; 
		}
		else {
			System.out.println("Width must be positive. Width not set");
		}
	}
	public void setHeight (double h) {
		if (h>0) {
			height= h; 
		}
		else {
			System.out.println("Height must be positive. Height not set");
		}
	}
	
	public double getWidth () {
		return width; 
	}
	public double getHeight() { 
		return height;
	}
	public double getArea() {
		double area = width * height; 
		return area;
	}
	public String toString() {
		String Rectangle = width + "by " + height + "rectangle"; 
		return Rectangle; 
	}
}
	
	
	
