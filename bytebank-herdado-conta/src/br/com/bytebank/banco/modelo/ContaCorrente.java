package br.com.bytebank.banco.modelo;

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override //Override e usado para sobrescrever o metodo da classe m�e, informando que ele foi alterado
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	//toString retorna o nome da classe mais a sua representa��o hexadecimal o endere�o no espa�o de memoria
	//para alterar este comportamento utiliza-se o metodo toString
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}

}
