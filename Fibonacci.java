package test;

public class Fibonacci
{
public static void main(String arg[])
{
int num=4,first=0,second=1,next;

for(int i=0;i<=4;i++)
{
System.out.println("" +first);
next=first+second;
first=second;
second=next;

}
}
}