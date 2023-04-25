package br.unipar.arrayactivity.methods;

public class BubbleSort extends Sort {

	@Override
    public void ordenation() {
        boolean change;
        startTimeExecution();
        do {
            change = false;
            for (int i = 0; i < getVectorSorted().length - 1; i++) {
                if (getVectorSorted()[i] > getVectorSorted()[i + 1]) {
                    int aux = getVectorSorted()[i];
                    getVectorSorted()[i] = getVectorSorted()[i + 1];
                    getVectorSorted()[i + 1] = aux;
                    change = true;
                }
            }
        } while (change);
        endTimeExecution();
    }
}
