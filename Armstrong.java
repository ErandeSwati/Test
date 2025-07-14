package test;

public class Armstrong

{
public static void main(String args[])

{

int num=153;
int d=num;
int arm=0;
while(num>0)
{
int digit=num%10;
num=num/10;
arm=arm+digit*digit*digit;
}
if(num==d)
{
System.out.println("number is armstrong");
}
else
{
System.out.println("number is armstrong");
}


}
}