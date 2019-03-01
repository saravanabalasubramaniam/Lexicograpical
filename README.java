import java.io.*;

import java.util.*;

class Sorting
  {
  
public static void main(String args[])

    {

    String a;
    Scanner input=new Scanner(System.in);

    a=input.nextLine();

    char[] ch=a.toCharArray();

    Arrays.sort(ch);
	for(int i=0;i<a.length();i++)
	{
		System.out.print(ch[i]);
	}
  }
} 
