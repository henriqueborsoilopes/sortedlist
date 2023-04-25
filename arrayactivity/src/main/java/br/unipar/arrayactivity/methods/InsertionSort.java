package br.unipar.arrayactivity.methods;

public class InsertionSort extends Sort {
    
	@Override
    public void ordenation() {
        startTimeExecution();
        int key, j;
        for (int i = 1; i < getVectorSorted().length; i++) {
            key = getVectorSorted()[i];
            for (j = i - 1; (j >= 0) && (getVectorSorted()[j] > key); j--) {
            	getVectorSorted()[j + 1] = getVectorSorted()[j];
            }
            getVectorSorted()[j + 1] = key;
        }
        endTimeExecution();
    }
}
