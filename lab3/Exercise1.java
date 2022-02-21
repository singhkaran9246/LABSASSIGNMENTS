import java.util.*;
class Exercise1
{
public static void main(String[]args)
{
System.out.println("enter the string");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringTokenizer st=new StringTokenizer(s," ");
int sum=0;
while(st.hasMoreTokens())
{

String temp=st.nextToken();
int n=Integer.parseInt(temp);
System.out.println(n);

//int sum=0;
sum=sum+n;
}
System.out.println("the sum of token"+sum);

}
}