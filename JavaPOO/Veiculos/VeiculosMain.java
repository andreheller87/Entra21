package Veiculos;

public class VeiculosMain {

    public static void main(String[] args) {
        
        Carro corolla = new Carro("Toyota", "Corolla", false);
        System.out.println("Carro - Modelo: " + corolla.getModelo() + ", Marca: " + corolla.getMarca());

        
        corolla.setLigado(true);
        System.out.println("Carro está ligado: " + corolla.isLigado());

       
        corolla.acelerar();
        System.out.println("Velocidade do carro: " + corolla.getVelocidade());
        
        System.out.println("Carro esta desligado: " + corolla.isLigado());
        
        System.out.println("-------------------------------------------------------");

       
        Moto CBR = new Moto("Honda", "CBR", false, 600);
        System.out.println("Moto - Modelo: " + CBR.getModelo() + ", Marca: " + CBR.getMarca() +
                ", Cilindradas: " + CBR.getCilindradas());

        
        CBR.setLigado(true);
        System.out.println("Moto está ligada: " + CBR.isLigado());

        
        CBR.acelerar();
        CBR.acelerar();
        CBR.acelerar();
        System.out.println("Velocidade da moto: " + CBR.getVelocidade());
        CBR.freiar();
        
        System.out.println("Velocidade da moto: " + CBR.getVelocidade());
        CBR.desligar();
        System.out.println("Moto esta Ligada: " + CBR.isLigado());
        
    }
}
