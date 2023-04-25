package br.unipar.arrayactivity.methods;

import java.util.Arrays;

public abstract class Sort {

	private int[] vectorOriginal;
	private int[] vectorSorted;
    private long timeStart;
    private long timeEnd;

    public void createVector(int size) {
        vectorOriginal = new int[size];
        vectorSorted = new int[size];
    }

    public void addValue(int position, int value) {
        vectorOriginal[position] = value;
        vectorSorted[position] = value;
    }
    
    public abstract void ordenation();
    
	public int[] getVectorSorted() {
		return vectorSorted;
	}
	
	public long getTimeExecution() {
		return timeEnd - timeStart;
	}

	public void startTimeExecution() {
		timeStart = System.nanoTime();
	}

	public void endTimeExecution() {
		timeEnd =  System.nanoTime();
	}

	@Override
	public String toString() {
		return "Vetor Original = " + Arrays.toString(vectorOriginal) + ",\nVetor Ordenando = " + Arrays.toString(vectorSorted) + ",\nTempo de execução (nanosegundos) = " + getTimeExecution();
	}
}
