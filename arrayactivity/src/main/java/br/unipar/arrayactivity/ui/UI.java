package br.unipar.arrayactivity.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.unipar.arrayactivity.methods.BubbleSort;
import br.unipar.arrayactivity.methods.InsertionSort;
import br.unipar.arrayactivity.methods.SelectionSort;
import br.unipar.arrayactivity.methods.Vector;
import br.unipar.arrayactivity.ui.exceptions.DataTypeException;
import br.unipar.arrayactivity.ui.exceptions.ValueChooseException;

public class UI {

	private static Scanner sc = new Scanner(System.in);
	private static int size;

	public static void askVectorSize() {
		String value = "";
		try {
			System.out.println();
			System.out.print("Informe o tamanho do vetor: ");
			value = sc.next();
			size = Integer.parseInt(value);
			Vector.createVector(size);
		} catch (NumberFormatException e) {
			throw new DataTypeException("Valor inválido! valor: " + value);
		}
	}

	public static void askVectorValues() {
		int value = 0;
		System.out.println();
		System.out.println("Insira " + size + " valores inteiros no vetor: ");
		try {
			for (int i = 0; i < size; i++) {
				System.out.print((i + 1) + "º: ");
				value = sc.nextInt();
				Vector.addValue(i, value);
			}
		} catch (InputMismatchException e) {
			throw new DataTypeException("Valor inválido! valor: " + value);
		}
	}

	public static void askSortVectorOption() {
		int option = 0;
		System.out.println();
		System.out.println("Ordenação por Inserção (1)");
		System.out.println("Ordenação por Seleção (2)");
		System.out.println("Ordenação por Bubble (3)");
		System.out.print("Informe o número da ordenação desejada: ");
		try {
			option = sc.nextInt();
		} catch (InputMismatchException e) {
			throw new DataTypeException("Valor inválido! valor: " + option);
		}
		System.out.println();
		System.out.println("Vetor ordenado: ");
		sortOptionChoosen(option);
	}

	public static void showOriginalVector() {
		System.out.println();
		System.out.println("Vetor original: ");
		Vector.showSortVector();
	}

	public static void showExecutionTimeAllSort() {
		System.out.println();
		System.out.println("Comparação do tempo de execução entre os métodos de ordenação: (em segundos)");
		InsertionSort.showExecutionTime();
		SelectionSort.showExecutionTime();
		BubbleSort.showExecutionTime();
	}

	public static boolean showContinuoQuestion() {
		System.out.println();
		System.out.print("Quer continuar a criação de vetores? (s) ou (n): ");
		return validateContinuoQuestion(sc.next().toLowerCase());
	}
	
	public static void executeAllSortMethods() {
		int[] vector = Vector.getVector().clone();
		InsertionSort.insertionSort(vector);
		SelectionSort.selectionSort(vector);
		BubbleSort.bubbleSort(vector);
	}
	
	private static void sortOptionChoosen(int option) {
		switch (option) {
			case 1 -> {
				InsertionSort.showSortVector();
				System.out.println();
				InsertionSort.showExecutionTime();
			}
			case 2 -> {
				SelectionSort.showSortVector();
				System.out.println();
				SelectionSort.showExecutionTime();
			}
			case 3 -> {
				BubbleSort.showSortVector();
				System.out.println();
				BubbleSort.showExecutionTime();
			}
			default -> {
				throw new ValueChooseException("Opção inválida!");
			}
		}
	}
	
	private static boolean validateContinuoQuestion(String option) {
		if (option.charAt(0) == 's') {
			return true;
		} else {
			throw new DataTypeException("Valor inválido! valor: " + option);
		}
	}
}
