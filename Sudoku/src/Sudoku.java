import java.util.ArrayList;
import java.util.HashSet; 

public class Sudoku 
{
	
	public static void main(String[] args)
	{
		  char [][] board = {{'D','4','2','5','8','F','9','6','7','3','1','A','C','B','0','E'},
					
                  			 {'3','7','A','E','D','B','C','5','F','9','6','0','4','8','2','1'},

			                 {'8','6','0','9','2','1','A','E','4','5','C','B','3','F','D','7'},
			
			                 {'C','F','B','1','7','0','4','3','2','E','D','8','6','9','A','5'},
			
			                 {'0','2','5','7','F','A','6','B','3','D','9','E','8','1','4','C'},
			
			                 {'6','9','4','D','1','8','3','C','A','2','F','7','B','5','E','0'},
			
			                 {'E','B','1','3','0','9','D','7','8','4','5','C','2','A','F','6'},
			
			                 {'A','8','C','F','4','5','E','2','B','1','0','6','9','3','7','D'},
			
			                 {'F','A','6','4','C','D','7','9','1','8','B','2','0','E','5','3'},
			
			                 {'B','5','D','2','A','3','0','1','6','C','E','9','F','7','8','4'},
			
			                 {'7','3','E','0','B','4','2','8','5','F','A','D','1','6','C','9'},
			
			                 {'1','C','9','8','6','E','5','F','0','7','4','3','A','D','B','2'},
			
			                 {'2','E','F','A','5','6','1','0','9','B','7','4','D','C','3','8'},
			
			                 {'9','D','7','6','3','2','B','4','C','A','8','5','E','0','1','F'},
			
			                 {'5','1','3','B','9','C','8','D','E','0','2','F','7','4','6','A'},
			
			                 {'4','0','8','C','E','7','F','A','D','6','3','1','5','2','9','B'}};

		  
		  

		      // Method 1.1 Call
		      // Calling method to check validity of the character entered (i.e. 0-9 and A-F).
		   // System.out.println(CharacterValidation('A')); 
		    
		   
//////////////////////////////////////		  
// FOR METHOD 1.2 PUT ROW LENGTH AND COLUMNS LENGTH IN A FOR LOOP AND CHECK FOR ALL ROWS AND ALL COLUMNS (USING 'i', 'j', loop counters 
//////////////////////////////////////
		  
		      // Method 1.2 Call
		      // Calling method to check row and column lengths are "16" and to check that there are "256" valid board entries.
		   // System.out.println(BoardValidation(board));
		    
		   
		      // Method 1.3 Call
		      // Calling method to check validity and uniqueness of the sub-grid.
		   // System.out.println(ValidSubGrid(board, 16, 16));
		   
		   
		      // Method 1.4 Call
		  	  // Calling method to check validity and uniqueness of the rows and columns.
		   // System.out.println(ValidRowANDColumn(2, board));
		  
		  
		      // Method 1.5 - CHALLENGE - Call
		  	  // Calling method to display number of errors.
		    System.out.println(Q5_NumberOfErrors(board));
	}
	
	
	// Method 1.1 - [2 MARKS]
	public static boolean CharacterValidation(char CharacterEntry)
	{ // Method 1.1
    	
		
	    // Storing all valid (character) entries in a character array called "ValiedEntries"
	    ArrayList<Character> ValidEntries = new ArrayList<Character>();
	
		ValidEntries.add('A');
		
	    ValidEntries.add('B');
	    
	    ValidEntries.add('C');
	    
	    ValidEntries.add('D');
	    
	    ValidEntries.add('E');
	    
	    ValidEntries.add('F');
	    
	    ValidEntries.add('0');
	
	    ValidEntries.add('1');
	
	    ValidEntries.add('2');
	
	    ValidEntries.add('3');
	
	    ValidEntries.add('4');
	
	    ValidEntries.add('5');
	
	    ValidEntries.add('6');
	
	    ValidEntries.add('7');
	
	    ValidEntries.add('8');
	
	    ValidEntries.add('9');
	
	    
	    
	  //Is the "CharacterEntry" part/one of the "ValidEntries"?
	    if (ValidEntries.contains(CharacterEntry) == true)
	    	return true;

	    else
	        return false;   
    }

	// Method 1.2 - [4 MARKS]
	@SuppressWarnings("unlikely-arg-type")
	public static boolean BoardValidation(char[][] BoardEntry)

	{// Method 1.2
		
	    ArrayList<Character> ValidEntries = new ArrayList<Character>();
		
		ValidEntries.add('A');
		
	    ValidEntries.add('B');
	    
	    ValidEntries.add('C');
	    
	    ValidEntries.add('D');
	    
	    ValidEntries.add('E');
	    
	    ValidEntries.add('F');
	    
	    ValidEntries.add('0');
	
	    ValidEntries.add('1');
	
	    ValidEntries.add('2');
	
	    ValidEntries.add('3');
	
	    ValidEntries.add('4');
	
	    ValidEntries.add('5');
	
	    ValidEntries.add('6');
	
	    ValidEntries.add('7');
	
	    ValidEntries.add('8');
	
	    ValidEntries.add('9');
		
		
		
		
		if (BoardEntry == null)
		{	
		    return false;
		}
		
		int no_of_valid_entries = 0;

	    // E.g. x[][] array_name = new T[rows][columns]
	    int rows = BoardEntry.length;
	    //System.out.println(rows);
	    int columns = BoardEntry[0].length;
	    //System.out.println(columns);
	    
	    int correct_rows = 0;
	    int correct_columns = 0; 
	  
	    //System.out.println("There are " + rows + " rows");
	    //System.out.println("There are " + columns + " columns");
	    
	    for (int i=0; i < BoardEntry.length; i++)
	    {
	        for (int j=0; j < BoardEntry[i].length; j++)
	        {

	        	if (ValidEntries.contains(BoardEntry[i][j]))
	            {
	                no_of_valid_entries++;
	            }
	        	
	        }
	        correct_rows++;
	        correct_columns++;

	    }
	    
	    
	    
	    if((correct_rows == 16) && (correct_columns == 16) && (no_of_valid_entries == 256))
	    {
	        return true;
	    }
	

	    else
	    	return false;
	}
	
	// Method 1.3 - [4 MARKS]
	public static int ValidSubGrid(char[][] BoardEntry, int row_number, int column_number)
	{ // Method 1.3
		
		// Check rows & columns
		if(((column_number < 1) || (column_number > 16)) && ((row_number < 1) || (row_number > 16)))
			return 0;
		

		// Check rows
		else if((row_number < 1) || (row_number > 16))
			return 1;
			
		// Check columns
		else if((column_number < 1) || (column_number > 16))
			return 2;
		
		// Check SubGrid uniqueness
		else
		{
			HashSet<Character> subgrid_check = new HashSet<Character>();
			
			row_number = row_number-1;
			column_number = column_number-1;

			int row_boundary = (row_number - (row_number % 4));
			int column_boundary = (column_number - (column_number % 4));

			for (int x = row_boundary; x < row_boundary + 4; x++) 
			{
			     for(int y = column_boundary; y < column_boundary + 4; y++) 
			     {			               
			    	 subgrid_check.add(BoardEntry[x][y]);
			         System.out.println(subgrid_check);
			             
			         if(subgrid_check.size() == 16)
			        	 return 3;
			     }
			}
		}
		return 99;

	}

	// Method 1.4 - [5 MARKS]
	public static int ValidRowANDColumn(int Input, char[][] BoardEntry)
	{ // Method 1.4
		
		ArrayList<Character> ValidEntries = new ArrayList<Character>();
		
		ValidEntries.add('A');
		
	    ValidEntries.add('B');
	    
	    ValidEntries.add('C');
	    
	    ValidEntries.add('D');
	    
	    ValidEntries.add('E');
	    
	    ValidEntries.add('F');
	    
	    ValidEntries.add('0');
	
	    ValidEntries.add('1');
	
	    ValidEntries.add('2');
	
	    ValidEntries.add('3');
	
	    ValidEntries.add('4');
	
	    ValidEntries.add('5');
	
	    ValidEntries.add('6');
	
	    ValidEntries.add('7');
	
	    ValidEntries.add('8');
	
	    ValidEntries.add('9');
		
		
		
		HashSet<Character> row_check = new HashSet<Character>();
		HashSet<Character> column_check = new HashSet<Character>();
		
		// ROW CHECK
		// -ve inputs are for the rows
		if ((Input <= -1) && (Input >= - 16))
		{
			int row_Input = (-Input) - 1; // Since index positions start at 0
			
			// when the counter 'p' is constant and set to the row_Input,
			// loop through each column of the board (for that specific row)
			// --> this nested loop will go through an the entire row (based on the input)
			for (int p = row_Input; ;)
			{
				for (int q = 0; q < BoardEntry[p].length; q++)
				{
					// This selection statement returns '4' if the check is valid
					// (i.e. if there are no repeated values in the specified row)
					row_check.add(BoardEntry[p][q]);
				}
				if ((row_check.size() == 16) && (row_check.containsAll(ValidEntries)))
					return 1;
				else
				    return -4;
			}
			
		}

		
		// COLUMN CHECK
		// +ve inputs are for the columns
		else if ((Input >= 1) && (Input <= 16))
		{
			
			int column_Input = Input - 1; // Since index positions start at 0
			
			// when the counter 'p' is constant and set to the column_Input,
			// loop through each row of the board (for that specific column)
			// --> this nested loop will go through an the entire column (based on the input)
			for (int p = column_Input; ;)
			{
				for (int q = 0; q < BoardEntry[p].length; q++)
				{
					// This selection statement returns '5' if the check is valid
					// (i.e. if there are no repeated values in the specified column)
					column_check.add(BoardEntry[q][p]);
				}
				if ((column_check.size() == 16) && (column_check.containsAll(ValidEntries)))
					return 2;
				else
				    return -5;
			}
		}
		
		
		// 0 CHECK
		else if (Input == 0)
			return 6;
		
		
		// INVALID ROW NUMBER CHECK
		else if (Input < -16)
			return 7;
		
		
		// INVALID COLUMN NUMBER CHECK
		else if (Input > 16)
			return 8;
		
		
		else
			return 99;
    }

	// challenge
	public static int Q5_NumberOfErrors(char board[][])
	{
			ArrayList<Character> ValidEntries = new ArrayList<Character>();
			
			ValidEntries.add('A');
			
		    ValidEntries.add('B');
		    
		    ValidEntries.add('C');
		    
		    ValidEntries.add('D');
		    
		    ValidEntries.add('E');
		    
		    ValidEntries.add('F');
		    
		    ValidEntries.add('0');
		
		    ValidEntries.add('1');
		
		    ValidEntries.add('2');
		
		    ValidEntries.add('3');
		
		    ValidEntries.add('4');
		
		    ValidEntries.add('5');
		
		    ValidEntries.add('6');
		
		    ValidEntries.add('7');
		
		    ValidEntries.add('8');
		
		    ValidEntries.add('9');
			
			
			
			
			if (board == null)
			{	
			    return -1;
			}
			
			int no_of_valid_entries = 0;
		    
		    int correct_rows = 0;
		    int correct_columns = 0; 
		  
		    //System.out.println("There are " + rows + " rows");
		    //System.out.println("There are " + columns + " columns");
		    
		    for (int i=0; i < board.length; i++)
		    {
		        for (int j=0; j < board[i].length; j++)
		        {

		        	if (ValidEntries.contains(board[i][j]))
		            {
		                no_of_valid_entries++;
		            }
		        	
		        }
		        correct_rows++;
		        correct_columns++;

		    }
		    
		    int errors = 32 - correct_rows - correct_columns; 
		    
		    if((correct_rows != 16) || (correct_columns != 16))
		    {
		        return errors;
		    }
		

		    else
		    	return -1;
	}

	
}


/*
------------------------------------------------------------------------------------------------------
			//Hash set used to store the board values of each SubGrid
			HashSet<Character> subgrid_check = new HashSet<Character>();


			// Counter 'x' used to iterate through the rows
			for(int x = 0; x < 16; x++)
			{
				
				// Counter 'y' used to iterate through the columns
				for(int y = 0; y < 16; y++)
				{
					
					// These loops begin by iterating across the 1st row 4 times (i.e. in sets of 4 boxes across)
					// and then increments down (in order to iterate through 
					// the next 4 boxes of the row below). Then this row gets iterated.........       
					int ColInd = 4*(x%4);
					
					
					subgrid_check.add(BoardEntry[x + y/4][ColInd + y%4]);
					//System.out.println(subgrid_check);
					
					if (subgrid_check.size() == 16)
						return 3;

				}	
			}
------------------------------------------------------------------------------------------------------
*/

