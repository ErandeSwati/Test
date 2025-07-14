package interviewPreparation;

import java.util.Arrays;

public class FindtheCharacter {

	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="swati7776";
		char[] c=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			boolean b=Character.isLetter(c[i]);
			System.out.println(c[i]+" is a charachter "+b);
			if(b)
			{
				count++;
			}
		}
		System.out.println(Arrays.toString(c));
		System.out.println("Total count of character:"+count);
		
	}

}
