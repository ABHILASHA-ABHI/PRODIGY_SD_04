# PRODIGY_SD_04

Automatic sudoku puzzle solver

### Project Overview

**Title:** Automated Sudoku Solver using Backtracking

**Objective:** 
The goal of this project is to develop a Java program that automatically solves Sudoku puzzles using the backtracking algorithm. The program is designed to take an input grid representing an unsolved Sudoku puzzle, solve it by filling in the missing numbers, and display both the unsolved and solved Sudoku grids.

**Scope:**
- Implement the Sudoku solving algorithm using backtracking.
- Handle standard 9x9 Sudoku puzzles.
- Provide a user-friendly output of both unsolved and solved Sudoku grids.

---

### Features

1. **Grid Display:**
   - Display the Sudoku grid in a readable format both before and after solving.

2. **Backtracking Algorithm:**
   - Use backtracking to explore possible solutions by placing numbers 1 to 9 in empty cells.
   - Ensure the solution adheres to Sudoku rules: numbers 1-9 must appear exactly once in each row, column, and 3x3 subgrid.

3. **Safety Check:**
   - Implement checks to ensure that a number can be placed in a cell without violating Sudoku rules.

4. **Automatic Solution:**
   - Automatically solve the puzzle if a solution exists, and provide feedback if no solution is possible.

5. **Error Handling:**
   - Handle cases where the Sudoku puzzle might be unsolvable or incorrectly formed.

---

### Results

1. **Unsolved Sudoku Grid:**
   - The initial grid with some numbers filled and others as zeros (or blanks), representing the unsolved state.

2. **Solved Sudoku Grid:**
   - The grid after applying the backtracking algorithm, showing the completed puzzle with all numbers filled in accordance with Sudoku rules.

**Example Execution:**

- **Unsolved Sudoku Grid:**
  ```
  5 3 0 0 7 0 0 0 0
  6 0 0 1 9 5 0 0 0
  0 9 8 0 0 0 0 6 0
  8 0 0 0 6 0 0 0 3
  4 0 0 8 0 3 0 0 1
  7 0 0 0 2 0 0 0 6
  0 6 0 0 0 0 2 8 0
  0 0 0 4 1 9 0 0 5
  0 0 0 0 8 0 0 7 9
  ```

- **Solved Sudoku Grid:**
  ```
  5 3 4 6 7 8 9 1 2
  6 7 2 1 9 5 3 4 8
  1 9 8 3 4 2 5 6 7
  8 5 9 7 6 1 4 2 3
  4 2 6 8 5 3 7 9 1
  7 1 3 9 2 4 8 5 6
  9 6 1 5 3 7 2 8 4
  2 8 7 4 1 9 6 3 5
  3 4 5 2 8 6 1 7 9
  ```

---

### Conclusion

The Sudoku solver program demonstrates the effectiveness of the backtracking algorithm in solving constraint satisfaction problems like Sudoku. By systematically exploring possible numbers for each empty cell and backtracking when necessary, the program efficiently finds the correct solution if one exists. The ability to handle a standard 9x9 Sudoku puzzle and provide a clear output of both unsolved and solved grids makes this tool a useful resource for Sudoku enthusiasts and a practical example of algorithmic problem-solving techniques in Java.
