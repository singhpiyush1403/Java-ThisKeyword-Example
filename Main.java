

class Example{
	private int x, y;
	void f1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}	
}
public class ThisKeyword {
	public static void main(String[] args) {
	Example E1 =  new Example();
	E1.f1(55,56);
	E1.display();
	}
}
