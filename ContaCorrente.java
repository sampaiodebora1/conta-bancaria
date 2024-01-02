package conta.model;

public class ContaCorrente {
	private int numero;
	private int agencia;
	private String nome;
	private float saldo;

	public ContaCorrente(int numero, int agencia, String nome, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}

}
