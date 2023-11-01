package studio7;

public class Die {
	
	private int n;
	
	public Die(int n) {
		this.n = n;
	}
	public int Random() {
		return (int)(this.n*Math.random())+1;
	}
	public int getn(){
		return n;
	}
	public void setn(int newN) {
		int n = newN;
	}

	public static void main(String[] args) {
	Die fluffy= new Die(12);
		Rectangle p1= new Rectangle(fluffy.Random(), 3);
		System.out.println(p1.Perimeter());
	}

}
