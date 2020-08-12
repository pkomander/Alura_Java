package bytebank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		//a variavel primeira conta e uma referencia para o objeto conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		//segunda conta recebe a referencia da primeira conta
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesmissima conta");
		}
		
		//mesma referencia para as duas contas
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
