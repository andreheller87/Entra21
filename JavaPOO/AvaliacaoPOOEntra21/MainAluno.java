package AvaliacaoPOOEntra21;
public class MainAluno{
    public static void main(String args[]){

        Aluno augusto = new Aluno();
        augusto.setNome("Augusto");
        augusto.setMat(1235);
        augusto.setNota1(7);
        augusto.setNota2(4.5);
        augusto.setNota3(2);
        augusto.setNota4(5);
        augusto.getMedia();
       
        augusto.exibir();
        augusto.mostrarMedia();
    }
}