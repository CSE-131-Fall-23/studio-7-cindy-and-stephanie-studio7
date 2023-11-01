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
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
