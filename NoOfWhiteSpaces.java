package test;
import java.util.Arrays;

public class NoOfWhiteSpaces
{

public static void main(String args[])
{
String s="swati vijay erande";
int count=0;
char c[]=s.toCharArray();
for(int i=0;i<s.length();i++)
{
boolean b=Character.isWhitespace(c[i]);
if(b)
{
count++;
}
}
System.out.println("No of spaces"+count);

}
}
