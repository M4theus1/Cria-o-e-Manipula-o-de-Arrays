package Atividade1;

public class atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {64, 25, 12, 22, 11};
		
		System.out.println("Array oringinal: ");
		imprimirArray(array);
		
		selectionSort(array);
		
		System.out.println("Array ordenado: ");
		imprimirArray(array);
	}
	
	public static void selectionSort(int[] array) {
		int n = array.length;
		
		for(int i = 0; i < n-1; i++) {
			int minIdx = i;
			for (int j = i+1; j < n; j++) {
				if(array[j] < array[minIdx]){
					minIdx = j;
				}
			}
			int temp = array[minIdx];
			array[minIdx] = array[i];
			array[i] = temp;
		}
	}

	public static void imprimirArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
