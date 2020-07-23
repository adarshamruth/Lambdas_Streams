package com.epam.lambda_streams;

import java.util.*;
import java.util.function.*;

public class Avg_list {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements:");
		int n=sc.nextInt();
		List<Integer>l=new ArrayList<>();
		System.out.print("Enter values:");
		for(int i=0;i<n;i++)
			l.add(sc.nextInt());
		/*Function<List<Integer>,Integer> res =list->{
            int sum=0;
            for(int i : list) {
                sum+=i;
            }
            return sum/list.size();
        };*/
		int res=avg(l, x-> {return x;} );
        System.out.println(res);
	}
	
	public static int avg(List<Integer> list, Function<Integer,Integer> res)
	{
		int sum=0;
		for(int i : list) {
			sum+=res.apply(i);
		}
		return sum/list.size();
	}

}
