package com.tech;

public class SudokuSolver {

    // Method to display the Sudoku grid
    private static void displayGrid(int[][] grid) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Method to check if it is safe to place a number in a cell
    private static boolean isSafe(int[][] grid, int row, int col, int num) {
        // Check the row
        for (int x = 0; x < 9; x++) {
            if (grid[row][x] == num) {
                return false;
            }
        }

        // Check the column
        for (int x = 0; x < 9; x++) {
            if (grid[x][col] == num) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Method to solve the Sudoku puzzle using backtracking
    private static boolean solveSudoku(int[][] grid) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;

        // Find an empty cell
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

        // No empty cell found, puzzle is solved
        if (isEmpty) {
            return true;
        }

        // Try placing numbers 1 to 9 in the empty cell
        for (int num = 1; num <= 9; num++) {
            if (isSafe(grid, row, col, num)) {
                grid[row][col] = num;
                if (solveSudoku(grid)) {
                    return true;
                }
                // Undo the current cell for backtracking
                grid[row][col] = 0;
            }
        }

        return false; // Trigger backtracking
    }

    public static void main(String[] args) {
        int[][] grid = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        System.out.println("Unsolved Sudoku grid:");
        displayGrid(grid);

        if (solveSudoku(grid)) {
            System.out.println("Solved Sudoku grid:");
            displayGrid(grid);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
