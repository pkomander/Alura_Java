package br.com.bytebank.banco.modelo;

/**
 * classe representa a moldura de uma conta
 * 
 * @author Paulo Araujo
 *
 */


//classe conta, com quatro atributos
public abstract class Conta extends Object implements Comparable<Conta>{
	//so podemos ver o valor de saldo atraves do metodo getSaldo
	protected double saldo;
	private int agencia;
	private int numero;
	//fazendo referencia a classe cliente
	private Cliente titular;
	private static int total = 0;//total passou a ser da classe implementando a contagem de contas
	
	
	/**
	 * Constructor para inicializar o objeto Conta a partir da agencia e numero.
	 * 
	 * @param agencia
	 * @param numero
	 */
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
	
	
	
	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException{
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
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
	
	//sobreescrevendo o metodo equals na classe mãe
	@Override
	public boolean equals(Object ref) {
		
		//fazendo o cast de dados da classe Object para conta
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	
	
	//toString retorna o nome da classe mais a sua representação hexadecimal o endereço no espaço de memoria
	//para alterar este comportamento utiliza-se o metodo toString
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}
	
	
}
