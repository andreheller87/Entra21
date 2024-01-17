package AvaliacaoPOOEntra21;


public class Aluno {
     private String nome;
     private int matricula;
     private double nota1,nota2, nota3, nota4, media;
     
     public void setNome(String nome) {
		this.nome = nome;
        }       
        public void setMat(int matricula) {
		this.matricula = matricula;
}	
     public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}  
	
	public double getMedia() {
	    this.media = (nota1 + nota2 + nota3 + nota4) / 4;
	    return media;
 }
	
	public String getNome() {
        return nome;
        }
	public int getMat() {
        return matricula;
        }
	public double getNota1() {
        return nota1;
        }
        public double getNota2() {
        return nota2;
        }
        public double getNota3() {
        return nota3;
        }
        public double getNota4() {
        return nota4;
        }
        
    
    
        public void exibir(){
        System.out.println("-------");
        System.out.println("Aluno: " +nome);
        System.out.println("Matrícula: " +matricula);
        System.out.println("---Média---");
        System.out.println(media);
    }
    
    public void mostrarMedia (){
        if (media >= 6 && media <= 10){
            System.out.println("Aprovado");
        } else if (media <= 5 && media >= 0){
            System.out.println("Reprovado");
        } else {
            System.out.println("Inválido");
        }
        
    }

}