package br.unipar.arrayactivity.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.unipar.arrayactivity.methods.BubbleSort;
import br.unipar.arrayactivity.methods.InsertionSort;
import br.unipar.arrayactivity.methods.SelectionSort;
import br.unipar.arrayactivity.methods.Sort;
import br.unipar.arrayactivity.ui.exceptions.DataTypeException;
import br.unipar.arrayactivity.ui.exceptions.ValueChooseException;

public class UI {

	private static Scanner sc = new Scanner(System.in);
	private static int size;
	private static Sort insertionSort = new InsertionSort();
	private static Sort selectionSort = new SelectionSort();
	private static Sort bubbleSort = new BubbleSort();

	public static void askVectorSize() {
		String value = "";
		System.out.println();
		System.out.print("Informe o tamanho do vetor: ");
		value = sc.next();
		try {
			size = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new DataTypeException("Valor inválido! valor: " + value);
		}
		insertionSort.createVector(size);
		selectionSort.createVector(size);
		bubbleSort.createVector(size);
	}

	public static void askVectorValues() {
		int value = 0;
		System.out.println();
		System.out.println("Insira " + size + " valores inteiros no vetor: ");
		for (int i = 0; i < size; i++) {
			System.out.print((i + 1) + "º: ");
			try {
				value = sc.nextInt();
			} catch (InputMismatchException e) {
				throw new DataTypeException("Valor inválido! valor: " + value);
			}
			insertionSort.addValue(i, value);
			selectionSort.addValue(i, value);
			bubbleSort.addValue(i, value);
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
		sortOptionChoosen(option);
	}

	public static void showExecutionTimeAllSort() {
		System.out.println();
		System.out.println();
		System.out.println("Comparação do tempo de execução entre os métodos de ordenação: (nanosegundos)");
		System.out.println("Ordenação Inserção = " + insertionSort.getTimeExecution());
		System.out.println("Ordenação Seleção = " + selectionSort.getTimeExecution());
		System.out.println("Ordenação Bolha = " + bubbleSort.getTimeExecution());
	}

	public static boolean showContinuoQuestion() {
		System.out.println();
		System.out.print("Quer continuar a criação de vetores? (s) ou (n): ");
		return validateContinuoQuestion(sc.next().toLowerCase());
	}
	
	public static void executeAllSortsMethods() {
		insertionSort.ordenation();
		selectionSort.ordenation();
		bubbleSort.ordenation();
	}
	
	private static void sortOptionChoosen(int option) {
		switch (option) {
			case 1 -> {
				System.out.print(insertionSort.toString());
			}
			case 2 -> {
				System.out.print(selectionSort.toString());
			}
			case 3 -> {
				System.out.print(bubbleSort.toString());
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
