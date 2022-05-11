package contas;

public class Conta {

	private String cliente;
	private String cpf;
	private double saldo;
	
	public Conta(String cliente, String cpf, double saldo) {
		this.cliente = cliente;
		this.cpf = cpf;
		this.saldo = saldo;
	}
}
