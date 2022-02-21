class Exercise5
{
public static void main(String[]args)
{
int result=Exercise5.calculateSum(10);
System.out.println("sum of the all natural numbers="+result);

}
public static int calculateSum(int n)
{
int sum=0;
for(int i=1;i<=n;i++)
{
if(i%3==0 ||i%5==0)
{
sum=sum+i;

}
}
return sum;





}
}