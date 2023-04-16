package br.unipar.arrayactivity.methods;

public class Vector {

    static int[] vector;

    public static int[] getVector() {
        return vector;
    }

    public static int[] createVector(int size) {
        return vector = new int[size];
    }

    public static void addValue(int position, int value) {
        vector[position] = value;
    }

    public static void printOutOriginalVector() {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vetor[" + i + "] = " + vector[i]);
        }
    }

    public static void printOutSortVector(long timeStart, long timeEnd, int[] sortVector) {
        for (int i = 0; i < sortVector.length; i++) {
            System.out.println("vetor[" + i + "] = " + sortVector[i]);
        }
        System.out.println();
        System.out.println("Demorou " + (timeStart - timeEnd) + " milésimos para executar essa ordenação.");
    }
}
