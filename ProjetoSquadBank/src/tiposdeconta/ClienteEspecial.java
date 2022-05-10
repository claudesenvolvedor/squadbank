package tiposdeconta;

import src.contas.Conta;

//herdará de class Conta
public class ClienteEspecial extends Conta {
	private String endereco;
	private String telefone;
	private String email;
	private String profissao;
	private String cargo;
	private double limite;
}
