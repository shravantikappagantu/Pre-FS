/* The diagonal from the top left corner to the bottom right corner of a the grid 
is called the main diagonal.

You have given a m*n grid of boxes, each box is filled with an number.
Your task is to check whether, each of the main diagonal all the boxes 
are filled with same number or not.

If filled with same, print true, Otherwise false.

Input Format:
-------------
Line-1: Two integers M and N, size of the grid..
Next M lines: N space separated integers, numbers filled in thr grid of boxes.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
3 4
1 2 3 4
5 1 2 3 
9 5 1 2

Sample Output-1:
----------------
true

Explanation:
------------
In the above grid, the diagonals are:
[9], [5, 5], [1, 1, 1], [2, 2, 2], [3, 3], [4].
In each diagonal all the boxes are filled with the same number, 
so the answer is True.
 */

import java.util.*;

class MainDiagonalsSame
{
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        
        int flag=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<m-1;j++)
            {
                if (arr[i][j]!=arr[i+1][j+1])
                {
                    flag=1;
                    break;
                }
            }
        }
        if (flag==1)
        System.out.println("false");
        else
        System.out.println("true");
	}
}