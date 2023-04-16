package br.unipar.arrayactivity;

import br.unipar.arrayactivity.methods.BubbleSort;
import br.unipar.arrayactivity.methods.InsertionSort;
import br.unipar.arrayactivity.methods.SelectionSort;
import br.unipar.arrayactivity.methods.Vector;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuo;
        int size;
        int value;
        do {
            System.out.print("Informe o tamanho do vetor: ");
            size = sc.nextInt();
            Vector.createVector(size);
            System.out.println("Insira " + size + " valores inteiros no vetor: ");
            for (int i = 0; i < size; i++) {
                System.out.print((i + 1) + "º: ");
                value = sc.nextInt();
                Vector.addValue(i, value);
            }
            System.out.println();
            System.out.println("(1) Ordenação por Inserção");
            System.out.println("(2) Ordenação por Seleção");
            System.out.println("(3) Ordenação por Bubble");
            System.out.print("Informe o tipo de ordenação: ");
            int choosen = sc.nextInt();
            System.out.println();
            System.out.println("Vetor original: ");
            Vector.printOutOriginalVector();
            System.out.println();
            System.out.println("Vetor ordenado: ");
            switch (choosen) {
                case 1 -> {
                    InsertionSort.insertionSort(Vector.getVector());
                    Vector.printOutSortVector(InsertionSort.getTimeStart(), InsertionSort.getTimeEnd(), InsertionSort.getSortVector());
                }
                case 2 -> {
                    SelectionSort.selectionSort(Vector.getVector());
                    Vector.printOutSortVector(SelectionSort.getTimeStart(), SelectionSort.getTimeEnd(), SelectionSort.getSortVector());
                }
                case 3 -> {
                    BubbleSort.bubbleSort(Vector.getVector());
                    Vector.printOutSortVector(BubbleSort.getTimeStart(), BubbleSort.getTimeEnd(), BubbleSort.getSortVector());
                }
            }
            System.out.println();
            System.out.print("Quer continuar a criação de vetores? (s) ou (n):  ");
            String response = sc.next();
            System.out.println();
            continuo = response.toUpperCase().equals("S");
        } while (continuo == true);
    }
}
