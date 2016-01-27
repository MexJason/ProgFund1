import java.util.ArrayList;

class Shape {
String color;
static int q=1;
static int p=1;
static int x=1;
public Shape(){
	
}
public Shape(String color, double area){
	
}
}
class Circle extends Shape{
	double radius, area;
	Circle(String c, double r){
		this.color=c;
		radius=r;
		calculateArea();
	}
	public double calculateArea(){
		area = radius*Math.PI;
		return area;
	}
	public String toString(){
		String print = System.lineSeparator()+"Color: "+color +System.lineSeparator()+"Radius: "+ radius+System.lineSeparator()+"Area "+area+System.lineSeparator();
		return print; 
	}
	
}
class Rectangle extends Shape{
	int length, width, area;
	Rectangle(String c, int l, int w){
		this.color=c;
		length=l;
		width=w;
		calculateArea();		
		}
	public int calculateArea(){
		area = length*width;
		return area;
	}
	public String toString(){
		String print = System.lineSeparator()+"Color: "+color+System.lineSeparator()+"Length: "+length+System.lineSeparator()+"Height: "+width+System.lineSeparator()+"Area: "+area+System.lineSeparator();
		return print;
	}
	
}
class Triangle extends Shape{
	int base, height;
	double area;
	Triangle(String c, int b, int h){
		this.color=c;
		base = b;
		height = h;
		calculateArea();
	}
	public double calculateArea(){
		area = base*height*(0.5);
		return area;
	}
	public String toString(){
		String print = System.lineSeparator()+"Color: "+ color+System.lineSeparator()+"Base: "+base +System.lineSeparator()+"Height: "+height+System.lineSeparator()+"Area: "+area+System.lineSeparator();
		return print; 
	}

}