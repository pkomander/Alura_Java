package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	//Array []
	public static void main(String[] args) {
		
		int[]idades = new int[5];//inicializa o array com os valores padroes, valor padrao do tipo int 0
		
		//inicializando o array em suas posições com os seus valores
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 49;
//		idades[3] = 59;
//		idades[4] = 69;
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		
		

	}

}
