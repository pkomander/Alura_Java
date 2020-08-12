//Gerente eh um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel, eh um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	
	//o atributo salario e referente a classe Funcionario por tanto não e correto utilizar o this
	//já que ele e da classe mãe, por tanto devemos utilizar o super para fazer referencia dizemos
	//o atributo funcionario e da classe mãe, da classe super
	//so utilizamos o this para atributos das classes que esta sendo chamada - this-desta classe
	public double getBonificacao() {
		System.out.println("chamando o método de bonificacap do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}
	
}