package javabasics;

import java.util.ArrayList;
public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)

			{
				System.out.println(arr[i]);
				break;

			} else {
				System.out.println(arr[i] + "is not a multiple of 2");
			}

		}
//for(int i: arr)
//{
//	System.out.println(i);
//	}

		ArrayList<String> a= new ArrayList<String>();
a.add("Saran");
a.add("Aiswarya");
System.out.println(a.get(1)+"," + a.get(0));

for(int i=0;i<a.size();i++)
{
	
	System.out.println(a.get(i));
	
}

System.out.println("***");
System.out.println(a.contains("Saran"));

for (String val:a)
{

	System.out.println(val);	
}
String s = "Rahul Shetty Academy";

for(int i=s.length()-1;i>=0;i--)
{

	System.out.println(s.charAt(i));
}
	}
}
