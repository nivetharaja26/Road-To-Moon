import java.io.*;
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] MatrixOne = { {8, -5, 7}, {45, 67, 14} };
        int[][] MatrixTwo = { {25, 13}, {-19, 10}, {10, 42} };


        
        int[][] product = Matricesmul(MatrixOne,MatrixTwo, r1, c1, c2);

        displayProduct(product);
    }

    public static int[][] Matricesmul(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return product;
    }

    public static void displayProduct(int[][] product) {
        System.out.println("Product of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    
    }
}