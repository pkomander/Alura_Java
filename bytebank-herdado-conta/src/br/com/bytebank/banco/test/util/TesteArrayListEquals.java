package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 22);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		
		//ArrayList inicia um array internamente com 1000 espacos ou o tamanho do espa�o em memoria
		//Generics <> = o array so pode ser criado se a referencia for do tipo conta
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		
		//contains faz a verifica��o, se existe ou n�o algo relacionado a lista ou la�o
		boolean existe = lista.contains(cc3);
		
		System.out.println("j� existe: " + existe);
		
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
