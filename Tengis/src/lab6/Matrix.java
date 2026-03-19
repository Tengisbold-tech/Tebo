package lab6;
import java.util.Scanner;

public class Matrix {

    private int [][] operand1;
    private int [][] operand2;
    private String operator;

    public Matrix(int [][] operand1, int [][] operand2, String operator){ 
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    private int [][] addition(int [][] operand1, int [][] operand2){
        int row = operand1.length;
        int col = operand1[0].length;

        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = operand1[i][j] + operand2[i][j];
            }
        }
        return result;
    }

    private int[][] subtraction(int[][] operand1, int[][] operand2) {

        int row = operand1.length;
        int col = operand1[0].length;

        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = operand1[i][j] - operand2[i][j];
            }
        }

        return result;
    }

    private int[][] multiplication(int[][] operand1, int[][] operand2) {

        int row = operand1.length;
        int col = operand2[0].length;
        int n = operand1[0].length;

        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += operand1[i][k] * operand2[k][j];
                }
            }
        }

        return result;
    }

    public int[][] chooseoperation() {

        int[][] result = null;

        if (operator.equals("+")) {
            result = addition(operand1, operand2);
        } 
        else if (operator.equals("-")) {
            result = subtraction(operand1, operand2);
        } 
        else if (operator.equals("*")) {
            result = multiplication(operand1, operand2);
        } 
        else {
            System.out.println("Invalid operator!");
        }

        if (result != null) {
            printmatrix(result);
        }

        return result;
    }

    private void printmatrix(int[][] pmatrix) {

        System.out.println("Result Matrix:");

        for (int i = 0; i < pmatrix.length; i++) {
            for (int j = 0; j < pmatrix[0].length; j++) {
                System.out.print(pmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }}

   