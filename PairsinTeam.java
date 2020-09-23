/*
In a team of N players wearing jerseys, each jersey has a number printed on it.
Jersey numbers may be repeated.

You will be given the list of jersey numbers of N players. 
You need to find out number of pairs, wearing same jersey number.
i.e, pair[i]=[p1, p2], p1 and p2 are the index positions
jersey number of Player-p1 and Player-p2 should be same.  

If no such pair found, print "0".

Input Format:
-------------
Line-1: An integer N, number of players.
Line-2: N space separated integers, Jersey numbers of players.

Output Format:
--------------
Print an integer, number of pairs wearing same jersey number.


Sample Input-1:
---------------
6
1 2 3 1 1 3

Sample Output-1:
----------------
4

Explanation: 
------------
There are 4 pairs (0,3), (0,4), (3,4), (2,5) wearing same jersey numbers, 
0-indexed list.

Sample Input-2:
---------------
3
1 2 3

Sample Output-2:
----------------
0  
*/

//efficient code using hashmap
// Java program to count of index pairs with 
// equal elements in an array. 
import java.util.*; 

class PairsinTeam
{ 

	public static int countPairs(int arr[], int n) 
	{ 
		HashMap<Integer,Integer> hm = new HashMap<>(); 
		 
		for(int i = 0; i < n; i++) 
		{ 
		if(hm.containsKey(arr[i])) 
			hm.put(arr[i],hm.get(arr[i]) + 1); 
		else
			hm.put(arr[i], 1); 
		} 

		int ans=0; 
		
		for(Map.Entry<Integer,Integer> it : hm.entrySet()) 
		{ 
			int count = it.getValue(); 
			ans += (count * (count - 1)) / 2; 
		} 
		return ans; 
	} 
	
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	int a[] = new int[n];
        	for (int i=0;i<n;i++)
        	{
            	    a[i]= sc.nextInt();
                }
		System.out.println(countPairs(a,n)); 
	} 
} 

/*

// brute force - O(n*n)

import java.util.*;
class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        
        int ans = 0; 
      
        for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++) 
            {
                if (a[i] == a[j]) 
                {
                    ans++; 
                }
            }
        }
        System.out.println(ans); 
    }
}
*/