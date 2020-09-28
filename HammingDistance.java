/*
You are given two integers M and N,
You need to find the count of bits different in 
their binary representation.

For example:
---------------
M = 4 and N =6
Binary of 4 => 1 0 0
Binary of 6 => 1 1 0
Count of bits different are 1.

Input Format:
-------------
Two integers M and N

Output Format:
--------------
Print an integer, count of bits different


Sample Input-1:
---------------
1 4

Sample Output-1:
----------------
2

Explanation:
------------
1 -> 0 0 1
4 -> 1 0 0 
		d s d

d-> different
s-> same

Now, count of d's is the answer.
*/
import java.util.*;
class HammingDistance
{
    public static int[] toBinary(int decimal)
    {    
         int binary[]=new int[40];    
         int index = 0;    
         while(decimal>0)
         {    
           binary[index++]=decimal%2;    
           decimal = decimal/2;    
         }    
         return binary;   
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        
        int a=sc.nextInt(),b=sc.nextInt();
        
        int b1[]= toBinary(a);
        int b2[]=toBinary(b);
        
        for(int i=0;i<b1.length;i++)
        {
            if(b1[i]!=b2[i])
            count++;
        }
        System.out.println(count);
    }
}
/*
import java.util.*;

class HammingDistance {
  public int hammingDistance(int x, int y) {
    // return Integer.bitCount(x ^ y); 
		int xor = x ^ y;
		int distance = 0;
		while (xor != 0) {
		  if (xor % 2 == 1)
			distance += 1;
		  xor = xor >> 1;
		}
		return distance;
	}
	
	public static void main (String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		int m = sc.nextInt(); 
		int n = sc.nextInt(); 
		System.out.println(new HammingDistance().hammingDistance(m,n)); 
	}
}
*/