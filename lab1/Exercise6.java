class Exercise6
{
public static void main(String[]args)
{
Exercise6 e=new Exercise6();
int result=e.calculateDifference(5);
System.out.println(result);
}
//claculate the difference

public int calculateDifference(int n)
{
int sum=0;
int sum1=0;
for(int i=1;i<=n;i++)
{
sum=sum+(i*i);

}
for(int j=1;j<=n;j++)
{
sum1=sum1+j;
}
int sum2=sum1*sum1;

return sum-sum2;

}

}