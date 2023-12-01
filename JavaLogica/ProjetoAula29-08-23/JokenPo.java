
public class JokenPo
{

    private byte jogada;

    public JokenPo(byte jogada){
        this.jogada = jogada;
    }

    public byte getJogada(){
        return this.jogada;
    }

    public String toString(){
        switch(this.jogada){
            case 1 : return "Pedra";
            case 2 : return "Papel";
            default: return "Tesoura";
        }
    }

}
