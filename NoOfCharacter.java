package interviewPreparation;

import java.util.Arrays;

public class NoOfCharacter{

	public static void main(String[] args) {

	String s="HelloWord";
	int count=0;
	char c[]=s.toCharArray();
	System.out.println(Arrays.toString(c));
	
	for(int i=0;i<s.length();i++)
	{
	boolean b=Character.isLetter(c[i]);
	
	if(b==true)
	{
	count++;
	}
}

	
	System.out.println("No of characters are:"+count);
}
}