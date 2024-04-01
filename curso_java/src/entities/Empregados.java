package entities;

public class Empregados {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	public void IncreaseSalary(double porcentage){
		grossSalary += grossSalary * (porcentage / 100);
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", NetSalary());
	}
}
