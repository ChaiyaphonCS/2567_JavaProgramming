
public class Rectangle {
	/*private float length;
	private float width;
	
	Rectangle(){
		length = 1.0f;
		width = 1.0f;
	}*/
	private float length = 1.0f;
	private float width = 1.0f;
	Rectangle(){}
	
	Rectangle(float lenght,float width){
		this.length = lenght;
		this.width = width;
		
	}
	public float getLenght() {
		return this.length;
	}
	public void setLenght(float lenght) {
		this.length = lenght;
	}
	public float getWidht() {
		return this.width;
	}
	public void setWidht(float widht) {
		this.width = widht;
	}
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return 2 * (this.length+this.width);
	}
	
	public String showData() {
		return "Rectangle[lenght= "+this.length+",width = "+this.width+"]";
	}
	public String toString() {
		return "Rectangle[lenght= "+this.length+",width = "+this.width+"]";
	}
	
	
	
	
}
