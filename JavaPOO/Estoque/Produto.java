package Estoque;

/**
 * 
 * 
 * @author André Heller
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Produto {

	
	private String nome;
	private Float valor;
	private Date Data;
	private Date validade;
	private int quantidade;
	private String observacao;
	private String armazenamento;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	

	public Produto() {

	}

	public Produto( String nome, Float valor, String data, String validade, int quantidade,
			String armazenamento) {
		super();
	
		this.nome = nome;
		this.valor = valor;
		try {
			this.Data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
			this.validade = new SimpleDateFormat("dd/MM/yyyy").parse(validade);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.armazenamento = armazenamento;
		this.quantidade = quantidade;
	}

	public Produto(Long id, String nome, Float valor, String data, String validade, int quantidade,
			String armazenamento) {
		super();
		
		this.nome = nome;
		this.valor = valor;
		try {
			this.Data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
			this.validade = new SimpleDateFormat("dd/MM/yyyy").parse(validade);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.armazenamento = armazenamento;
		this.quantidade = quantidade;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Date getData() {
		return Data;
	}

	public Date getValidade() {
		return validade;
	}

	public String getDataString() {

		return sdf.format(Data);
	}

	public String getValidadeString() {

		return sdf.format(validade);
	}

	public void setData(Date data) {

		Data = data;
	}

	public void setValidade(Date validade) {
		this.validade = validade;

	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}

	@Override
	public String toString() {
		return "\n ----------------------------------------\n Produto  nome: " 
	            + nome + ", valor unit: " + valor + ", Data fabricação: " + getDataString()
	            + "\n Data validade: " + getValidadeString()
				+ ", quantidade=" + quantidade + ", armazenamento=" 
	            + armazenamento
				+ "\n Valor Total: "+ getValorTotal()+" \n---------------------------------------------\n";
	}

	

	public Float getValorTotal() {
		String valorTotalString = String.format("%.2f", this.getValor() * this.quantidade);
		valorTotalString = valorTotalString.replace(',', '.');
		return Float.parseFloat(valorTotalString);
	}

}
