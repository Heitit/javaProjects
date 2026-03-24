package Application;

import java.util.Scanner;
import Entities.conta;

public class sistema {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		conta conta = new conta(numero, titular);
		
		System.out.print("Valor de depósito: ");
		conta.depositar(sc.nextDouble());
		System.out.println("Dados atualizados: " + conta);
		
		System.out.print("Valor do saque: ");
		conta.sacar(sc.nextDouble());
		System.out.println("Dados atualizados: " + conta);
		System.out.print("Há um desconto de R$5,00 em cada saque");
		
		
		sc.close();
	}
}