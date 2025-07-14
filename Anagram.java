
package test;
import java.util.Arrays;

public class Anagram
{
public static void main(String arg[])
{
String s="act";
String ss="cat";

s=s.toLowerCase();
ss=s.toLowerCase();
if(s.length()!=ss.length())
{
System.out.println("No Anagram");
}
else
{
System.out.println("Eligible for Anagram");
char c[]=s.toCharArray();
char cc[]=ss.toCharArray();
Arrays.sort(c);
Arrays.sort(cc);
if(Arrays.equals(c,cc))
{
System.out.println("Anagram");
}
else
{
System.out.println("Not Anagram");
}
}
}
}