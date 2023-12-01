
public class NaoPrimitivoInSwitchCaseExemple
{
    public static void  main(String []args){
        Integer idade =16;
        switch(idade){
            case (16):
                System.out.println("Vocẽ tem menos de 18.");
                break;
                case(18):
                System.out.println("Vocẽ é elegível por voto.");
                break;
                case(65):
                System.out.println("Vocẽ é idoso.");
                break;
            default:
                System.out.println("Por favor forneça uma idade válida.");
                break;

        }
    }
}
