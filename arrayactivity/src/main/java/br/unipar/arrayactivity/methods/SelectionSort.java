package br.unipar.arrayactivity.methods;

public class SelectionSort {

    static int[] sortVector;
    static long timeStart;
    static long timeEnd;

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
    
    public static int[] getSortVector() {
        return sortVector;
    }

    public static long getTimeStart() {
        return timeStart;
    }

    public static long getTimeEnd() {
        return timeEnd;
    }
}
