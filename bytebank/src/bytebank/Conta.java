package bytebank;

//classe conta, com quatro atributos
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	
	//metodo para depositar
	//o this faz referencia a conta que invoca ao metodo
	public void deposita(double valor) {
		
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
}
