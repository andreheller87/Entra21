package Veiculos;


public class Moto extends Veiculo {

    private String marca;
    private int cilindradas;

    public Moto() {
        super();
        this.ligado = false;
    }

    public Moto(String marca, String modelo, boolean ligado, int cilindradas) {
        super(modelo);
        this.marca = marca;
        this.ligado = false;
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
