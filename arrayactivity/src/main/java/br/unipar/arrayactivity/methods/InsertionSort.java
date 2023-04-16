package br.unipar.arrayactivity.methods;

public class InsertionSort {
    
    static int[] sortVector;
    static long timeStart;
    static long timeEnd;

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
