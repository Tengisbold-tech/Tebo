package lab6;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Operatoroo songo (+, -, *): ");
	        String operator = sc.next();

	        System.out.print("Matrix(1)-iin mur: ");
	        int mur1 = sc.nextInt();

	        System.out.print("Matrix(1)-iin bagana: ");
	        int bag1 = sc.nextInt();

	        int[][] m1 = new int[mur1][bag1];

	        System.out.println("Matrix1 element oruul:");

	        for (int i = 0; i < mur1; i++) {
	            for (int j = 0; j < bag1; j++) {
	                System.out.print("[" + i + "][" + j + "] = ");
	                m1[i][j] = sc.nextInt();
	            }
	        }

	        System.out.print("Matrix(2)-iin mur: ");
	        int mur2 = sc.nextInt();

	        System.out.print("Matrix(2)-iin bagana: ");
	        int bag2 = sc.nextInt();

	        if ((operator.equals("+") || operator.equals("-")) && (mur1 != mur2 || bag1 != bag2)) {
	            System.out.println("Matrix-iin hemjee ijil baih yostoi");
	            return;
	        }

	        if (operator.equals("*") && bag1 != mur2) {
	            System.out.println("Matrix-iig urjuulj bolohgui");
	            return;
	        }

	        int[][] m2 = new int[mur2][bag2];

	        System.out.println("Matrix2 element oruul:");

	        for (int i = 0; i < mur2; i++) {
	            for (int j = 0; j < bag2; j++) {
	                System.out.print("[" + i + "][" + j + "] = ");
	                m2[i][j] = sc.nextInt();
	            }
	        }

	        Matrix matrix = new Matrix(m1, m2, operator);

	        matrix.chooseoperation();
	    }
	}


