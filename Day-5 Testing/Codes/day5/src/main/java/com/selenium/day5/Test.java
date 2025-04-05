package com.selenium.day5;

import java.util.*;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int sum=sc.nextInt();
			boolean res = combfour(arr,sum);
			if(res)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			
		}
		public static boolean combfour(int[] arr,int sum)
		{
			int n=arr.length;
			int s=0;
			for(int i=0;i<n;i++)
			{
				s+=arr[i];
				for(int j=i+1;j<=3;j++)
				{
					s+=arr[j];
				}
				if(s==sum)
				{
					return true;
				}
			}
			return false;
	}

}
