
//classe conta, com quatro atributos
public abstract class Conta {
	//so podemos ver o valor de saldo atraves do metodo getSaldo
	protected double saldo;
	private int agencia;
	private int numero;
	//fazendo referencia a classe cliente
	private Cliente titular;
	private static int total;//total passou a ser da classe implementando a contagem de contas
	
	
	
	//constructor
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total de contas é " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando uma conta " + this.numero);
	}
	
	
	
	//metodo para depositar
	//o this faz referencia a conta que invoca ao metodo
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	//definindo um novo numero para conta atraves de um metodo, pois numero e privado
	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	
}
