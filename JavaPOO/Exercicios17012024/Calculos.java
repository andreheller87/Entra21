package Exercicios17012024;

public class Calculos {

	private float num1,num2,total;

	public Calculos() {
		this.num1 = 0;
		this.num2 = 0;
		this.total = 0;
	}
	
	public Calculos(float num1, float num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float calculo01(float v1, float v2){
		float res;
		res = (v1 * v2) / (v1 + v2);
		return (res);
	}

	

	public float calculo02(){
		total = num1 - 3 * num2;
		return(total);

	}

	public void calculo03(){
		total = (num1 - num2) / num2;
	}

	
	

}
