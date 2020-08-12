
//contrato Autenticavel
	//quem assina esse contrato, precisa implementar
		//metodo setSenha
		//metodo autentica


public abstract interface Autenticavel {

	
	//interface e uma classe abstrata com todos os seus metodos abstratos, não pode ter nada completo
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
