package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperinteger {

	public static void main(String[] args) {
		
		
		int idade = 29;//Integer
		
		//metodo para criar um obejto com tipo primitivo
		Integer idadeRef = Integer.valueOf(29);//autoboxing
		
		
		System.out.println(idadeRef.doubleValue());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		int valor = idadeRef.intValue();//unboxig
		
		String s = args[0];//"10"
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);//transformando uma string para um tipo primitivo
		System.out.println(numero);
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef); //Autoboxing = e a transformação de primitivo para objeto automaticamente ou o contrario
		
	}

}
