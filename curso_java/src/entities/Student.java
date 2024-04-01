package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	
	public double media() {
		
		return grade1 + grade2 + grade3;

	}
	public String toString() {
		if(media() > 60) {
			return "Final Grade = "
					+ String.format("%.2f %n", media())
					+"Pass";
		}
		else {
			return "Final Grade = "
					+ String.format("%.2f %n", media())
					+ String.format("%s %n", "Failed ")
					+ "Missing "
					+ String.format("%.2f", 60 - media())
					+ " Points";
		}
	}
}
