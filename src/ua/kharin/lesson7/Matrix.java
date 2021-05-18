package ua.kharin.lesson7;

import java.util.Arrays;

public class Matrix {
	private final double[][] inner;

	public Matrix(double[][] inner) {
		this.inner = inner;
	}

	public static void main(String[] args) {
		double[][] arrayForFirstMatrix = {{1, 2, 3},
				{2, 3, 4},
				{1, 2, 3},
				{2, 3, 4}};
		double[][] arrayForSecondMatrix = {{11, 22, 33},
				{22, 33, 44},
				{51, 52, 53},
				{52, 53, 54}};
		Matrix firstMatrix = new Matrix(arrayForFirstMatrix);
		firstMatrix.print();
		Matrix secondMatrix = new Matrix(arrayForSecondMatrix);
		secondMatrix.print();
		Matrix sumMatrix = firstMatrix.add(secondMatrix);
		sumMatrix.print();
		Matrix multMatrix = firstMatrix.multByNumber(2);
		multMatrix.print();
		firstMatrix.multByNumberLocal(2);
		firstMatrix.print();
	}

	public void setElement(int row, int column, double newValue) {
		validateIndices(row, column);
		inner[row][column] = newValue;
	}

	public double getElement(int row, int column) {
		validateIndices(row, column);
		return inner[row][column];
	}

	public void print() {
		System.out.println(toString());
	}

	public Matrix add(Matrix anotherMatrix) {
		double[][] resultArray = new double[inner.length][inner[0].length];
		for (int i = 0; i < inner.length; i++) {
			for (int j = 0; j < inner[i].length; j++) {
				resultArray[i][j] = inner[i][j] + anotherMatrix.getElement(i, j);
			}
		}
		return new Matrix(resultArray);
	}

	public Matrix multByNumber(double multiplier) {
		double[][] resultArray = new double[inner.length][inner[0].length];
		for (int i = 0; i < inner.length; i++) {
			for (int j = 0; j < inner[i].length; j++) {
				resultArray[i][j] = inner[i][j] * multiplier;
			}
		}
		return new Matrix(resultArray);
	}

	public void multByNumberLocal(double multiplier) {
		for (int i = 0; i < inner.length; i++) {
			for (int j = 0; j < inner[i].length; j++) {
				inner[i][j] *= multiplier;
			}
		}
	}

	@Override
	public String toString() {
		return Arrays.deepToString(inner);
	}

	private void validateIndices(int row, int column) {
		if (row >= inner.length || column >= inner[0].length) {
			throw new RuntimeException("wrong row or column");
		}
	}
}
