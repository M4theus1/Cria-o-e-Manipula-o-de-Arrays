package Atividade1;

public class atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		somaLinha(matriz);
		somaColuna(matriz);
	}
	
	public static void somaLinha(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			int soma = 0;
			for(int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
			}
			System.out.println("Soma da linha "+ (i + 1) + ": " + soma);
		}
	}

	public static void somaColuna(int[][] matriz) {
		for(int j = 0; j < matriz[0].length; j++) {
			int soma = 0;
			for(int i = 0; i < matriz.length; i++) {
				soma += matriz[i][j];
			}
			System.out.println("Soma da coluna " + (j + 1) + ": "+ soma);
		}
	}
}
