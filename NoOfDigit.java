package interviewPreparation;

import java.util.Arrays;

public class NoOfDigit{

	public static void main(String[] args) {

String s="Hello Word8969668996";
int count=0;
char c[]=s.toCharArray();
for(int i=0;i<s.length();i++)
{
boolean b=Character.isDigit(c[i]);
if(b)
{
count++;
}
}
System.out.println("number of digit are:"+count);


}
}