/*
Prasad is given a list of integers nums[].
He like odd numbers, so he wanted to form  
the odd length consecutive subsets possible.

Now your task is to help Prasad, to form the odd length subsets,
and to compute and print the sum of all such subsets.

Input Format:
-------------
Line-1: An integer N, number of integers.
Line-2: N space separated integers, nums[].

Output Format:
--------------
Print an integer, the sum.


Sample Input:
---------------
5
1 4 2 5 3

Sample Output:
----------------
58

Explanation:
------------
From the given list of integers, possible subsets are.
[1] = 1, [4] = 4, [2] = 2, [5] = 5, [3] = 3,
[1,4,2] = 7,	[4,2,5] = 11,	[2,5,3] = 10
[1,4,2,5,3] = 15
Finally, total sum is:  1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
*/


// O(n) solution 
// confusing math
import java.util.*;
class SumofOddSubsets
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
        for (int i = 0; i < n; ++i) 
        {
            ans += ((i + 1) * (n - i) + 1) / 2 * a[i];
        }
        System.out.println(ans);
    }
}

/*
// less efficient
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
        
        int i = 0, sum = 0;
        do {
            for (int j = 0; j < n-i; j++) 
            {
                for (int k = j; k <= j + i; k++) 
                {
                    sum += a[k];
                }
            }
            i += 2;
        }
        while (i<n);
        System.out.println(sum);
    }
}
*/