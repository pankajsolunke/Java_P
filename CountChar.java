package com.practice.arrays;

import java.util.Arrays;

public class CountChar {

	public static void main(String[] args) {
		String str="sshuabmhsam";
		
		char[] ch=str.toCharArray();
		boolean[] visited = new boolean[ch.length];
		
		int arr3[]=new int[ch.length];
		
		for(int i=0;i<ch.length;i++)
		{
			if(visited[i])
			{
				continue;
			}
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					visited[j] = true;
				}
			}
			System.out.println(Arrays.toString(visited));
			System.out.println(ch[i]+" "+count);
		}
		
	}

}
