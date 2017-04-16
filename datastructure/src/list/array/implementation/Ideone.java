package list.array.implementation;
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] numbers1 = new int[4];
 
		String[] strings = new String[4];
 
		numbers1[0]=10;
		numbers1[1]=20;
		numbers1[2]=30;
 
		int[] numbers2 = {10, 20, 30, 40};
		int[] numbers3 = new int[]{10, 20, 30, 40};
 
		System.out.println("System.out.println(numbers1[0]);");
		System.out.println(numbers1[0]);
 
		System.out.println("System.out.println(numbers1[3]);");
		System.out.println(numbers1[3]);
 
		System.out.println("System.out.println(numbers1.length);");
		System.out.println(numbers1.length);
	}
}