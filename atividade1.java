package Atividade1;
import java.util.Random;

public class atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[10];
		Random random = new Random();
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100);
		}
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		int soma = 0;
		for(int numero : numeros) {
			soma += numero;
		}
		
		System.out.println("Soma: " + soma);
		
		int menor = 100;
		for(int numero : numeros) {
			if(numero < menor) {
				menor = numero;
			}
		}
		
		int maior = 0;
		for(int numero : numeros) {
			if(numero > maior) {
				maior = numero;
			}
		}
		System.out.println("MAIOR: " + maior);
		System.out.println("MENOR: " + menor);
	}
}
