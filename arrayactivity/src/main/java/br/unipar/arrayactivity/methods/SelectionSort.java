package br.unipar.arrayactivity.methods;

public class SelectionSort extends Sort {

	@Override
    public void ordenation() {
		startTimeExecution();
        for (int i = 0; i < getVectorSorted().length - 1; i++) {
            int posMenor = i;
            for (int j = i + 1; j < getVectorSorted().length; j++) {
                if (getVectorSorted()[j] < getVectorSorted()[posMenor]) {
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                int aux = getVectorSorted()[i];
                getVectorSorted()[i] = getVectorSorted()[posMenor];
                getVectorSorted()[posMenor] = aux;
            }
        }
        endTimeExecution();
    }
}
