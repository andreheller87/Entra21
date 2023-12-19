package Teste01;

public abstract class Empregador {

	private String firstName;
	private String lastName;
	private String securityNumber;
	
	
	
	public Empregador(String firstName, String lastName, String securityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.securityNumber = securityNumber;
	}



	public Empregador() {
		
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getSecurityNumber() {
		return securityNumber;
	}



	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}



	@Override
	public String toString() {
		return String.format("%s %s número de segurança: %s ", this.getFirstName(),this.getLastName(),this.getSecurityNumber());
	}

	public abstract double ganhos();
	
	
}
