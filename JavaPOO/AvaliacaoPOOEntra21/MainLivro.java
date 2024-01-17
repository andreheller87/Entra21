package AvaliacaoPOOEntra21;

public class MainLivro {
    public static void main(String args[]) {

    
    	
        Livro livro = new Livro("lucefer", "jose", 1);
    	System.out.println(livro.toString());
    	
        livro.emprestar();
        
        System.out.println(livro.toString());
        
        livro.devolvelo();
        
        livro.verificar();
        
        System.out.println(livro.toString());
        

    }
}
