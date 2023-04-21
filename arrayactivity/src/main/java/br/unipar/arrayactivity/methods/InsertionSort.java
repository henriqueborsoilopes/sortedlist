package br.unipar.arrayactivity.methods;

public class InsertionSort {
    
	private static int[] sortVector;
	private  static long timeStart;
	private static long timeEnd;

    public static void insertionSort(int[] vector) {
        timeStart = System.currentTimeMillis();
        int key, j;
        for (int i = 1; i < vector.length; i++) {
            key = vector[i];
            for (j = i - 1; (j >= 0) && (vector[j] > key); j--) {
                vector[j + 1] = vector[j];
            }
            vector[j + 1] = key;
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
    	System.out.println("Tempo de execução por Ordenação Inserção: " + (timeStart - timeEnd));
    }
}
