package br.unipar.arrayactivity.methods;

public class BubbleSort {

    static int[] sortVector;
    static long timeStart;
    static long timeEnd;

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
