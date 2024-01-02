package conta.model;

public class ContaPoupanca {
	private int numero;
	private int agencia;
	private String nome;
	private float saldo;
	
	public ContaPoupanca(int numero, int agencia, String nome, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}

}
