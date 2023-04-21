package br.unipar.arrayactivity.methods;

public class BubbleSort {

    private static int[] sortVector;
    private static long timeStart;
    private static long timeEnd;

    public static void bubbleSort(int[] vector) {
        boolean change;
        timeStart = System.currentTimeMillis();
        do {
            change = false;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    int aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                    change = true;
                }
            }
        } while (change);
        timeEnd = System.currentTimeMillis();
        sortVector = vector;
    }
    
    public static void showSortVector() {
        for (int i = 0; i < sortVector.length; i++) {
            System.out.println("posição[" + i + "] = " + sortVector[i]);
        }
    }

    public static void showExecutionTime() {
    	System.out.println("Tempo de execução por Ordenação Bolha: " + (timeStart - timeEnd));
    }
}
