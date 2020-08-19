package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {

	public static void main(String[] args) {
		
		
		int idade = 29;//Integer
		
		//metodo para criar um obejto com tipo primitivo
		Integer idadeRef = Integer.valueOf(29);//autoboxing
		System.out.println(idadeRef.intValue());//unboxing
		
		//Double dRef = 3.2;// ou
		Double dRef = Double.valueOf(3.2);//autoboxing
		System.out.println(dRef.doubleValue());//unboxing
		
		//generics
		List<Number> referencias = new ArrayList<>();
		referencias.add(Double.valueOf(30.9));
		referencias.add(Integer.valueOf(10));
		referencias.add(Float.valueOf(13.4f));
		
		
	}

}
