package FINALEXAM;

public class Rectangle {
private int height;
private int width;
public Rectangle(int height, int width) {
	this.height=height;
	this.width=width;
}
	
public int getHeight() {
	return height;
}
public int getWidth() {
	return width;
}
public void setHeight(int height) {
		this.height=height;
}
public void setWidth(int width) {
	this.width=width;
}
double areaRec() {
	double area=height*width;
	return area;
}
public double periREc() {
	double peri = 2 *(height+width);
	return peri;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect1 = new Rectangle(10, 20);
		System.out.println("Area of the Rectangle: "+(rect1.areaRec()));
		System.out.println("Perimeter of the Rectangle: "+ rect1.periREc());
		

	}

}
