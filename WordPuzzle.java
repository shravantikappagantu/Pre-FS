/*
Pranay is playing a single row word puzzle.
The Word Puzzle P contains a word, formed by using letter-blocks.
You are allowed to do only one operation:
	- You can remove a letter-block, and join 
	  the remaing letter-blocks into a single word.

Note: You cannot put back the removed letter-block.
And relative order of the letter-blocks has to be maintained.

Pranay is given a word W, and the word puzzle P,
You need to help Pranay, to check whether he can form the word W,
from the given word puzzle P.

Input Format:
-------------
Two strings W and P

Output Format:
--------------
Print a boolean value


Sample Input-1:
---------------
coder commander

Sample Output-1:
----------------
true


Sample Input-2:
---------------
memory memorial

Sample Output-2:
----------------
false

*/

import java.util.*;

class WordPuzzle
{
    public boolean isPossible(String w, String p) {
        if (w.length() == 0) 
		return true;

        int indexW = 0, indexP = 0;

        while (indexP < p.length()) 
	{
            if (p.charAt(indexP) == w.charAt(indexW)) 
	    {
                indexW++;
                if (indexW == w.length()) 
			return true;
            }
            indexP++;
        }
        return false;
    }
	
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String w=sc.next();
        String p=sc.next();
	System.out.println(new WordPuzzle().isPossible(w,p));
    }
}