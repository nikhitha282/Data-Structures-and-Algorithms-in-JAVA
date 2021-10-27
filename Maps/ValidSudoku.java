/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
Dot in the input array indicates it is blank
*/

import java.util.*;

class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, List<Character>> gridmap = new HashMap<>();
        Map<Integer, List<Character>> rowsmap = new HashMap<>();
        Map<Integer, List<Character>> colsmap = new HashMap<>();
        
        char dot = '.';
        int hash;
        
        for(int i=0; i<9; i++) {            
            for(int j=0; j<9; j++) {
                
                //ignore dots as they are similar to blank spaces
                if(board[i][j] == dot) continue;
                
                //checking rows for uniqueness
                if(rowsmap.containsKey(i)) {
                    if(rowsmap.get(i).contains(board[i][j]))
                        return false; //if the current value already exists in the map, it violates Sudoku principle
                }
                else
                    rowsmap.put(i, new ArrayList<>()); //key for row hash map is index of the row
                
                rowsmap.get(i).add(board[i][j]); 
                
                //checking columns
                if(colsmap.containsKey(j)) {
                    if(colsmap.get(j).contains(board[i][j]))
                        return false;
                }
                else
                    colsmap.put(j, new ArrayList<>()); //key for column hash map is index of the column
                
                colsmap.get(j).add(board[i][j]);
                
                //checking grids
                hash = 3*((int)i/3) + ((int)j/3); //hash key for a grid a calculated this way
                
                if(gridmap.containsKey(hash)) {
                    if(gridmap.get(hash).contains(board[i][j]))
                        return false;
                }
                else
                     gridmap.put(hash, new ArrayList<>());
                
                gridmap.get(hash).add(board[i][j]);      
            }      
        }
        return true;
    }
    
    public static void main(String[] args) {
    	char[][] validBoard = {{'5','3','.','.','7','.','.','.','.'}
						 ,{'6','.','.','1','9','5','.','.','.'}
						 ,{'.','9','8','.','.','.','.','6','.'}
						 ,{'8','.','.','.','6','.','.','.','3'}
						 ,{'4','.','.','8','.','3','.','.','1'}
						 ,{'5','.','.','.','2','.','.','.','6'}
						 ,{'.','6','.','.','.','.','2','8','.'}
						 ,{'.','.','.','4','1','9','.','.','5'}
						 ,{'.','.','.','.','8','.','.','7','9'}};
      
      char[][] invalidBoard = {{'5','3','.','.','7','.','.','.','.'}
						 ,{'5','.','.','1','9','5','.','.','.'}
						 ,{'.','9','8','.','.','.','.','6','.'}
						 ,{'8','.','.','.','6','.','.','.','3'}
						 ,{'4','.','.','8','.','3','.','.','1'}
						 ,{'5','.','.','.','2','.','.','.','6'}
						 ,{'.','6','.','.','.','.','2','8','.'}
						 ,{'.','.','.','4','1','9','.','.','5'}
						 ,{'.','.','.','.','8','.','.','7','9'}};
    	
    	System.out.println(isValidSudoku(validBoard));
      System.out.println(isValidSudoku(invalidBoard));
    }
}
