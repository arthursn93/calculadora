package br.com.calculadora.teste;

import br.com.calculadora.Calculadora;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora(20,10);
		
		double soma = calculadora.soma(calculadora);
		System.out.println(soma);
		double subtrai = calculadora.subtrai(calculadora);
		System.out.println(subtrai);
		double multiplica = calculadora.multiplica(calculadora);
		System.out.println(multiplica);
		double divide = calculadora.divide(calculadora);
		System.out.println(divide);
	}

}
