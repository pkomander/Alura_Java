
public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch(Exception ex) {//exception generico(poliformico), vai capturar qualquer exce��o
			String msg = ex.getMessage();
			System.out.println("Exeption " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
		
	}
	
	//try = vai tentar resolver a exce��o
	//catch = vai capiturar a exce��o e executar o bloco
	//throw = joga o erro na pilha de codigo e sai do metodo 2, so funciona com exe��es
	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("deu muito errado");
		
		//System.out.println("Fim do metodo2");
	}

}
