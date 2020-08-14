
public class FluxoComError {
	
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exeption " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
		
	}
	
	//try = vai tentar resolver a exceção
	//catch = vai capiturar a exceção e executar o bloco
	//throw = joga o erro na pilha de codigo e sai do metodo 2, so funciona com exeções
	private static void metodo2() {
		System.out.println("Ini do metodo 2");
		metodo2();
		System.out.println("fim do metodo 2");
	}

}
