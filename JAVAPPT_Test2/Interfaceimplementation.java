class Circle implements Drawable{

	@Override
	public void draw() {
		System.out.println("Drawing Circle");		
	}
	
}

class Rectangle implements Drawable{

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");		
	}
	
}

public class Interfaceimplementation {

	public static void main(String[] args) {
		
		Drawable cir = new Circle();
		cir.draw();
		
		Drawable rect = new Rectangle();
		rect.draw();

	}

}
