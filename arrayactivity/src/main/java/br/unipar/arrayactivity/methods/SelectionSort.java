package br.unipar.arrayactivity.methods;

public class SelectionSort {

	private static int[] sortVector;
	private static long timeStart;
	private static long timeEnd;

    public static void selectionSort(int[] vector) {
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < vector.length - 1; i++) {
            int posMenor = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[posMenor]) {
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                int aux = vector[i];
                vector[i] = vector[posMenor];
                vector[posMenor] = aux;
            }
        }
        timeEnd = System.currentTimeMillis();
        sortVector = vector;
    }
    
    public static void showSortVector() {
        for (int i = 0; i < sortVector.length; i++) {
            System.out.println("posição[" + i + "] = " + sortVector[i]);
        }
    }

    public static void showExecutionTime() {
    	System.out.println("Tempo de execução por Ordenação Seleção: " + (timeStart - timeEnd));
    }
}
