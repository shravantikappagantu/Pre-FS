/*
Every student loves to get out of the classroom and explore,
School Excursion is one of the best ways to explore new things.

ABC School took their students to an excursion.
Students are asked to stand in a line, You are given heights of the students.
You need to make the students to stand in ascending order of their heights.

Your task is to find out, the minimum number of students that must change their positions
in order to make evey student to stand in ascending order.

Note: When a student is selected, the student can change position in a possible way
among all of them, and the non selected students remain on their positions.

Input Format:
-------------
Line-1: An integer N, number of the students.
Line-2: N space separated integers, heights of the students.

Output Format:
--------------
Print an integer, minimum number of moves.


Sample Input-1:
---------------
6
1 1 4 2 1 3

Sample Output-1:
----------------
3

Explanation:
------------
Initially Heights are as follows : [1,1,4,2,1,3] 
Targeted Heights are as follows : [1,1,1,2,3,4] 
On index 2: you have 4 vs 1 so you have to change the position of student. 
On index 4: you have 1 vs 3 so you have to change the position of student. 
On index 5: you have 3 vs 4 so you have to change the position of student. 


Sample Input-2:
---------------
5
5 1 4 2 3

Sample Output-2:
----------------
5
*/

import java.util.*;

class HeightChecker 
{
        public int heightChecker(int[] h) 
	{
        int[] temp=h.clone();
        Arrays.sort(temp);
        int count=0;
        for (int i=0;i<h.length;i++){
            if (temp[i]!=h[i]) count++;
        }
        return count;
    }
	
	public static void main(String arg[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int heights[]= new int[n];
		for(int i=0; i<n; i++)
				heights[i]=sc.nextInt();
				
		System.out.print(new HeightChecker().heightChecker(heights)); 
	} 
}
