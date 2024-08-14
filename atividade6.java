package Atividade1;
import java.util.ArrayList;
import java.util.Random;

public class atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		
		for(int i = 0;i<10; i++) {
			int numeroAleatorio = random.nextInt(100)+1;
			numeros.add(numeroAleatorio);
		}
		
		System.out.println("Números gerados: "+ numeros);
		
		int valorBuscado = 75;
		
		int indice = buscarIndice(numeros, valorBuscado);
		
		if(indice != -1) {
			System.out.println("O valor "+ valorBuscado+ "Foi encontrado no índice "+indice);
		}else {
			System.out.println("O valor "+ valorBuscado+ " não foi localizado na lista");
		}
	}
	
	public static int buscarIndice(ArrayList<Integer> lista, int valor) {
		for(int i = 0;i < lista.size();i++) {
			if(lista.get(i) == valor) {
				return i;
			}
		}
		return -1;
	}
}
