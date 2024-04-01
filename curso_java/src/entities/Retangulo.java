package entities;

public class Retangulo {
	public double Width;
	public double Height;
	public double p;
	public double Area() {
		
		return Width * Height;
	}

	public double Perimeter() {
		 p = (Width * 2) + (Height * 2);
		return p;
	}

	public double Diagonal() {
		return Math.sqrt((Math.pow(Width, 2)) + (Math.pow(Height, 2)));
	}
	
}
