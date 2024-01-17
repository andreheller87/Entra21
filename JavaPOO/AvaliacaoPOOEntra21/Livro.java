package AvaliacaoPOOEntra21;



public class Livro {
    private String titulo;
    private String autor;
    private int numeroPagina;
    private boolean disponivel;

    public Livro(String titulo, String autor, int numeroPagina ) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
        this.disponivel = true;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(){
        if (disponivel == false){
            System.out.println("livro indisponivel");
        }
        this.disponivel = false;
        System.out.println("livro emprestado");
    }
    public void devolvelo(){
        this.disponivel = true;
        System.out.println("livro devolvido");
    }

    public void verificar(){
        if (disponivel == true){
            System.out.println("livro disponivel");
        }else {
        	System.out.println("livro indisponivel");
        }
    }


	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", numeroPagina=" + numeroPagina + ", disponivel="
				+ disponivel + "]";
	}
    

}
