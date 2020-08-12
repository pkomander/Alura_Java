
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222222222-22";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		//atribuindo a referencia por meio da associação
		//tambem chamado de composição
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
	}
}
