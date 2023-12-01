
public class Jogo
{
    private JokenPo usuario;
    private JokenPo comp;

    public Jogo(byte jogadaUsuario){
        this.usuario = new  JokenPo(jogadaUsuario);
        byte sorteio = (byte)(Math.random()*3+1);
        this.comp = new JokenPo(sorteio);
    }

  
    public String verificarVencedor(){
        byte usu = this.usuario.getJogada();
        byte comp = this.comp.getJogada();
        if(usu == comp){
            return "Empate";
        }else if(usu == 1 && comp == 3 || usu == 2 && comp == 1 || usu == 3 && comp == 2 ){
            return "Usuario Vence!!";
        }else{
            return "Computador vence!!";
        }
    }

    public String toString(){
        return "Usuario jogou " + this.usuario + "\nComputador jogou " + this.comp;
    }
}
