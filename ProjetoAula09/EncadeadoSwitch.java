
public class EncadeadoSwitch
{
    public static void main(String args[]){
        char ramo = 'C';
        int anoDaFaculdade =4;

        switch(anoDaFaculdade){
            case 1:
                System.out.println("Inglés, Matemática, Ciência"); 
                break;
            case 2:
                switch(ramo){
                    case 'C':
                        System.out.println("Sistemas Operacionais, Java, Estrutura de Dados");
                        break;
                    case 'E':
                        System.out.println("Micro processadores, Teoria da Lógica de Programação");
                        break;
                    case 'M':
                        System.out.println("Desenho, Máquinas de Fabricação");
                        break;

                }
                break;
            case 3:
                switch(ramo){
                        case'C':
                        System.out.println("Organização Computacionais Multimédia");
                        break;
                    case 'E':
                        System.out.println("Fundamentos de lógica de Design, Microelectrónicos");
                        break;
                    case 'M':
                        System.out.println("Motores de Combustão Interna, Vibração Mecanica");
                        break;
                }
                break;
            case 4:
                switch(ramo){
                        case'C':
                        System.out.println("Comunicação de dados e redes, multimédia");
                        break;
                    case 'E':
                        System.out.println("Sistemas Embarcados, Processamento de Imagem");
                        break;
                    case 'M':
                        System.out.println("Produção Tecnológica, Energia Térmica");
                        break;
                }
                break;
        }
    }
}