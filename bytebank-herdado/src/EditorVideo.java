//EditorVideo eh um Funcionario, Gerente herda da class Funcionario
public class EditorVideo extends Funcionario{

	
	public double getBonificacao() {
		System.out.println("chamando o m�todo de bonificacao do editor de video");
		return 150;
	}
	
}