package Entities;

public class conta {
	private int numero;
	private String titular;
	private double saldo;

	public conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		depositar(depositoInicial);}
	
	public conta (int numero, String titular) {
		this.numero = numero;
		this.titular = titular;}
	
	public int getNumero() {
		return numero;}
	public String getTitular() {
		return titular;}
	public void setTitular(String titular) {
		this.titular = titular;}
	public double getSaldo() {
		return saldo;}
	
	public void depositar (double valor) {
		saldo +=valor;}
	public void sacar (double valor) {
		saldo -= valor +5.0;}
	
	public String toString() {
		return "Conta: " + numero + ", Titular: " + titular + ", Saldo: $ " + String.format("%.2f", saldo);}	
}