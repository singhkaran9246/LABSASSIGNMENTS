
class Exercise1
{
public static void main(String[]args)
{

Exercise1 e=new Exercise1();
e.cube(1);
}

public  void cube(int num)
{
int mod;
int sum=0;
//while(num>0)
for(int i=num;num<=5;num++)
{
mod=num;
sum=sum+(mod*mod*mod);
}
System.out.println("the sum of the cubes ="+sum);
}
}