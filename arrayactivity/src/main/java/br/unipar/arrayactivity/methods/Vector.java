package br.unipar.arrayactivity.methods;

public class Vector {

	private static int[] vector;

    public static int[] getVector() {
        return vector;
    }

    public static int[] createVector(int size) {
        return vector = new int[size];
    }

    public static void addValue(int position, int value) {
        vector[position] = value;
    }

    public static void showSortVector() {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("posição[" + i + "] = " + vector[i]);
        }
    }
}
