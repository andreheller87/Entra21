package Teste01;

public class Salario extends Empregador  {

	private double salarioSemanal;
	
	

	public Salario(String first, String last, String sn, double salario) {
		super(first,last,sn);
		setSalarioSemanal(salario);
	}
	
	public void setSalarioSemanal(double sal ) {
		salarioSemanal = sal < 0.0 ? 0.0 : sal;
	}


	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	@Override
	public double ganhos() {
		
		return getSalarioSemanal();
	}

	@Override
	public String toString() {
		return String.format( "Salário semanal: %s\n%s:$%,.2f" ,super.toString(),"salario semanal", getSalarioSemanal());
	}

	
	
	



	
}
