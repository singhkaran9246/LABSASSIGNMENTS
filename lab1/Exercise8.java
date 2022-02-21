import java.util.*;
class Exercise8
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
if(checkNumber(number)==true)
System.out.println(number+"is power of two");
else
System.out.println(number+"is not power of two");
}

static boolean checkNumber(int number)
{
if(number==1)
return true;
else if (number%2!=0||number==0)
return false;
return checkNumber(number/2);
}
}