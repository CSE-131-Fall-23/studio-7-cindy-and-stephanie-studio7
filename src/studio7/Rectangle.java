package studio7;

public class Rectangle {
	
	private int width;
	private int length;
	
	public Rectangle(int w, int l) {
		width=w;
		length=l;
	}
	public int Area() {
		return width*length;
	}
	public int Perimeter() {
		return width*2+length*2;
	}
	public boolean isSquare() {
		if(width==length) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public int getl() {
		return length;
	}
	public int getw() {
		return width;
	}
	public static void main(String[] args) {
		Rectangle p1= new Rectangle(4, 3);
		System.out.println(p1.Perimeter());
		// TODO Auto-generated method stub
	}

}
