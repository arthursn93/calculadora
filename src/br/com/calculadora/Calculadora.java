package br.com.calculadora;

public class Calculadora {
	private double valorUm;
	private double valorDois;
	
	public Calculadora(double valorUm, double valorDois) {
		this.valorUm = valorUm;
		this.valorDois = valorDois;
	}
	
	public double divide(Calculadora calcula) {
		return valorUm / valorDois;
	}
	
	public double multiplica(Calculadora calcula) {
		return valorUm *= valorDois;
	}
	
	public double subtrai(Calculadora calcula) {
		return valorUm -= valorDois;
	}
	
	public double soma(Calculadora calcula) {
		return valorUm += valorDois;
	}
	
	public double getValorUm() {
		return valorUm;
	}

	public void setValorUm(double valorUm) {
		this.valorUm = valorUm;
	}
	
	public double getValorDois() {
		return valorDois;
	}

	public void setValorDois(double valorDois) {
		this.valorDois = valorDois;
	}
}
