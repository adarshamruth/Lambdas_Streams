package com.epam.lambda_streams;

import java.util.*;
import java.util.function.*;

public class StringsStartWith_a {
	
	public static void main(String args[])
	{
		String [] strArray= {"","apple","ant","Ape","aaa","abcd"};
		List<String> strList=Arrays.asList(strArray);
		List<String> resultList=getStringsList(strList,  (String str) -> {return str.startsWith("a")&&str.length()==3;} );
	    System.out.println(resultList);
	}
	
	public static List<String> getStringsList(List<String> list, Predicate<String> predicate){
		List<String> result=new ArrayList<>();
		for(String str : list) {
			if(predicate.test(str))
				result.add(str);
		}
		return result;
	}
}
