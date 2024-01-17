package Exercicios16012024.CalculadoraMediaAluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private List<Double> nota = new ArrayList();
	private Double Media;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, List<Double> nota, Double media) {
		super();
		this.nome = nome;
		this.nota = nota;
	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Double> getNota() {
		return nota;
	}
	public void addNota(Double nota) {
		this.nota.add(nota);
	}
	public Double getMedia() {
	Double	media = 0.0;
	for (Double notaAluno : nota) {
		media += notaAluno; 
		
		
	}
	media = media / nota.size();
		return media;
	}
	

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota=" + nota + ", Media=" + getMedia() + "]";
	}
	
	
	
}
