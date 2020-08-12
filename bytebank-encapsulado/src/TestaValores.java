
public class TestaValores {

	public static void main(String[] args) {
		
		//todo parentese que vem depois de new Conta ou qualquer outra criação de objeto 
		//recebe um constructor default que pode ser alterado na classe que o contem
		//podendo ser passado valores que podem ser atribuidos
		//podendo ser utilizado ou não depende da regra de negocio que esta sendo utilizada
			
		Conta conta = new Conta(1337, 24226);
		
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(1337, 14660);
		
		System.out.println(Conta.getTotal());
	}
}
