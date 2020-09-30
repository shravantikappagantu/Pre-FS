/*
Arjun wants to build a swimming pool, in the backyard of his farm-house.
The backyard has an empty land of size m*n. 
Some part of the backyard is used to build the swimming pool
You will be given the m*n grid values (0's and 1's). 
where 1 indicates swimming pool, and 0 indiactes empty land.

Your task to find the perimeter of the swimming pool.

Note: There is only one swimming pool.

Input Format:
-------------
Line-1: Two integers M and N, size of the backyard.
Next M lines: N space separated integers, either 0 or 1
0- represents empty land and 1- represents the swimming pool 

Output Format:
--------------
Print an integer, the perimeter of the swimming pool


Sample Input-1:
---------------	
4 4
0 1 0 0
1 1 1 0
0 1 0 0
1 1 0 0
 
Sample Output-1:
----------------
16


Sample Input-2:
---------------
1 2
1 0
 
Sample Output-2:
----------------
4

For explanation of sample test cases given refer Hint-1.

*/

import java.util.*;

class SwimmingPool {
    public int spPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int result = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    result += 4;
                    if (r > 0 && grid[r-1][c] == 1) {
                        result -= 2;
                    }
                    if (c > 0 && grid[r][c-1] == 1) {
                        result -= 2;
                    }
                }
            }
        }      
        return result;
    }
	
	public static void main(String arg[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int grid[][]= new int[r][c];
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)
				grid[i][j]=sc.nextInt();
				
		System.out.print(new SwimmingPool().spPerimeter(grid)); 
	} 
}
