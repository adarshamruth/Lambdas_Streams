package com.epam.lambda_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Palindrome {
	public static void main(String args[])
	{
		String [] strArray= {"mam","radar","bye","madam","bad","rotator"};
		List<String> strList=Arrays.asList(strArray);
		List<String> resultList=new ArrayList<>();
				for(String i : strArray)
			 	{
			 		IPalindrome predicate = PalindromePredicate::palindrome;
			       if(predicate.isPalindrom(i))
			       {
			    	   resultList.add(i);
			       }
			 	}
			 	
			 	System.out.println("Palindromes "+resultList);
	}

}

interface IPalindrome
{
	 boolean isPalindrom(String s);
}
class PalindromePredicate
{
	public static boolean palindrome(String s)
	{
		return new StringBuffer(s).reverse().toString().equals(s);
	}
	
}