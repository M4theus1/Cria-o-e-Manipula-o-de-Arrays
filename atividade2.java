package Atividade1;
public class atividade2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int valor1 = 30;
		int valor2 = 75;
		int valor3 = 100;
		
		int resultado1 = buscarIndice(numeros, valor1);
		int resultado2 = buscarIndice(numeros, valor2);
		int resultado3 = buscarIndice(numeros, valor3);
		
		System.out.println("Indice do valor " + valor1 + ": "+ resultado1);
		System.out.println("Indice do valor " + valor2 + ": "+ resultado2);
		System.out.println("Indice do valor " + valor3 + ": "+ resultado3);
	}
	
	public static int buscarIndice(int[] array, int valor) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == valor) {
				return i;
			}
		}
		return -1;
	}

}
