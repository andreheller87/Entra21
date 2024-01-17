package AvaliacaoPOOEntra21;



public class ContaBancaria {
    private int numConta;
    private String nome;
    private double saldo;

    public ContaBancaria(Integer numConta, String nome){
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = 0;
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void sacar(double saldo){
        if(getSaldo() - saldo> 0){
            this.saldo-=saldo;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositar(double saldo){
        this.saldo+=saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numConta=" + numConta +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
